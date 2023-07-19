import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Window {
    private JPanel princ;
    private JTabbedPane tabbedPane1;
    private JComboBox cBoxCiudad;
    private JTextField txtNombre;
    private JButton buscarPorCiudadYButton;
    private JTextArea txtArea;
    private JTextField txtTracking;
    private JButton btnBuscarTracking;
    private JTextArea textArea1;
    private JComboBox cboSumaCiuda;
    private JButton sumarPorCiudadButton;
    private JTextArea textArea2;
    private Lista lista=new Lista();
public Window() {
    buscarPorCiudadYButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String ciudad=cBoxCiudad.getSelectedItem().toString();
            String nombre=txtNombre.getText();
            StringBuilder texto= new StringBuilder();
            ArrayList<Paquete> listado=lista.buscarCiudadNombre(ciudad,nombre);
            if(listado.size()==0)txtArea.setText("No existe elementos en la busqueda");
            else{
                for(Paquete p:listado){
                    texto.append(p.toString()+"\n");
                }
                txtArea.setText(texto.toString());
            }
        }
    });
    btnBuscarTracking.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int tracking=Integer.parseInt(txtTracking.getText());
           Paquete p=lista.buscarBinario(tracking);
            if(p!=null)JOptionPane.showMessageDialog(null,p.toString());
            else JOptionPane.showMessageDialog(null,"nuay");
        }
    });
    sumarPorCiudadButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String ciuda=cboSumaCiuda.getSelectedItem().toString();
            textArea2.setText(String.valueOf(lista.totalPeso(ciuda)));

        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setContentPane(new Window().princ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
