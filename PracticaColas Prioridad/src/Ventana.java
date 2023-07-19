import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class Ventana {
    private JPanel principal;
    private JTextField txtNombre;
    private JTextField txtProceso;
    private JComboBox combo;
    private JButton btnIngresar;
    private JList list1;
    private JButton btnEliminar;
    private JButton btnMostrar;
    Cola cola=new Cola();
    private Ventanasec ventana2;
    private DefaultListModel    dlm=new DefaultListModel<>();
public Ventana() {
    btnIngresar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre= txtNombre.getText();
            String tramite= txtProceso.getText();
            int prioridad= Integer.parseInt(combo.getSelectedItem().toString());
            Persona p= new Persona(nombre,tramite,prioridad);
            cola.ingresar(p);
            llenar();
        }
    });
    btnEliminar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                cola.quitar();
                JOptionPane.showMessageDialog(null,"Eliminao");
                llenar();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    });
    btnMostrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                JOptionPane.showMessageDialog(null,cola.mostrar());
                llenar();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    });

}
    public void llenar (){
        dlm.removeAllElements();
        Stream<Persona> ordenado= cola.listaPerona().stream().sorted();
        for(Persona obj:ordenado.toList()){
            dlm.addElement(obj.toString());
        }
        list1.setModel((dlm));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
