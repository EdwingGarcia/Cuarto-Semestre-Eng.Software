import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField txtPalabra;
    private JButton btnVerificar;
    private JPanel principal;


public Ventana() {
    this.setContentPane(principal);//para que se muestre el panel que se quiere proyectar
    btnVerificar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String ingreso=txtPalabra.getText();
            if(esPalindromo(ingreso)){
                JOptionPane.showMessageDialog(null,ingreso+" SI es palindromo");
            }else{
                JOptionPane.showMessageDialog(null,ingreso+" NO es palindromo");
            }
        }



    });
}


private boolean esPalindromo(String texto){

    MiPila pila= new MiPila();

    for(int i=0;i<texto.length();i++){
        pila.push(texto.charAt(i));
    }

    return texto.equals(pila.toString());
}





    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               Ventana formulario=new Ventana();
               formulario.setSize(300,300);
               formulario.setVisible(true);
            }
        });
    }
}


