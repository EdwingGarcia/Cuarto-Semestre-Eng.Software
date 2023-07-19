import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Ventana {
    private JPanel principal;
    private JSpinner spCodigo;
    private JTextField txtNombre;
    private JTextArea txtArea;
    private JComboBox cbCreditos;
    private JButton btnEncolar;
    private JButton btnDesencolar;
    private JButton btnConsultar;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(900 ,500);
        frame.setVisible(true);
    }

    public Ventana() {

    Cola filaEstudiantes= new Cola();

    btnEncolar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int codigo=Integer.parseInt(spCodigo.getValue().toString());
            String nombre= txtNombre.getText();
            int creditos= Integer.parseInt(cbCreditos.getSelectedItem().toString());
            Estudiante llegao= new Estudiante(codigo,nombre,creditos);
            filaEstudiantes.encolar(llegao);
            txtArea.setText(filaEstudiantes.toString());
        }
    });
        btnConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Estudiante estudiante= filaEstudiantes.elementoInicial();
                    JOptionPane.showMessageDialog(null,estudiante.toString()
                    +"\nDebería pagar: "+ estudiante.valorMatricula());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }


        });
        btnDesencolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Estudiante eliminado=filaEstudiantes.desencolar();
                    JOptionPane.showMessageDialog(null,"Se ha desencolado a "+ eliminado.toString());
                    txtArea.setText(filaEstudiantes.toString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }


            }
        });
    }
}
