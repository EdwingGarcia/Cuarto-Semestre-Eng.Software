import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class Ventana {
    private JPanel principal;
    private JComboBox cboPrioridad;
    private JTextField txtNombre;
    private JTextField txtEnfermedad;
    private JButton btnEncolar;
    private JList lstPacientes;
    private JButton btnMostrar;
    private JButton btnDesencolar;
    Clinica pacientes= new Clinica();
    private DefaultListModel dlm= new DefaultListModel();
public Ventana() {
    btnEncolar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int prioridad=Integer.parseInt(cboPrioridad.getSelectedItem().toString());
            String nombre= txtNombre.getText();
            String enfermedad=txtEnfermedad.getText();
            pacientes.encolar(new Paciente(prioridad,nombre,enfermedad));
            llenarJlist();        }
    });
    btnDesencolar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Paciente paci=pacientes.desencolar();
                llenarJlist();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());            }
        }
    });


    btnMostrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Paciente paci=pacientes.mostrar();
                JOptionPane.showMessageDialog(null,paci);
                llenarJlist();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());            }
        }
    });
}



    public void llenarJlist(){
    dlm.removeAllElements();
   Stream<Paciente> ordenado= pacientes.listaPacientes().stream().sorted();
    for(Paciente obj:ordenado.toList()){
        dlm.addElement(obj.toString());
        }
    lstPacientes.setModel((dlm));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
