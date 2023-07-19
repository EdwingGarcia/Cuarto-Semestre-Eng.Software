import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtObservacion;
    private JTextArea txtArea;
    private JButton btnIngreso;
    private JButton btnEliminar;

    Pila pila=new Pila();



public Ventana() {
    btnIngreso.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String codigo= txtCodigo.getText();
          String nombre=txtNombre.getText();
          String observacion=txtObservacion.getText();
          Historial hist=new Historial(codigo,nombre,observacion);
          pila.push(hist);
          txtArea.setText(pila.toString());
        }
    });
    btnEliminar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                JOptionPane.showMessageDialog(null,pila.pop().toString());
                txtArea.setText(pila.toString());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
