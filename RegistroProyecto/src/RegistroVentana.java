import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroVentana {
    private JTextField txtUsuario;
    private JButton iniciarSesiónButton;
    private JPanel principalRegistro;
    private JButton registrarseButton;
    private JPasswordField passwordField1;
    private JTextField txtUsuarioRegistrado;
    private JTextField txtCcorreoRegistrado;
    private JPasswordField txtContrasenaRegistrado;
    private JPasswordField txtContraseñaConfRegistrado;
    private RegistroUsuario registroUsuario=new RegistroUsuario();

    public static void main(String[] args) {
        JFrame frame = new JFrame("RegistroVentana");
        frame.setContentPane(new RegistroVentana().principalRegistro);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public RegistroVentana() {
    iniciarSesiónButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre=txtUsuario.getText();
            char[] pass = passwordField1.getPassword();
            String passwordString = new String(pass);
            Usuario usuarioEncontrado=registroUsuario.buscar(nombre);
            if(usuarioEncontrado!=null){
                if(usuarioEncontrado.getContrasena().equals(passwordString)){
                    JOptionPane.showMessageDialog(null,"Usuario Accedio");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                }
            }else{
                JOptionPane.showMessageDialog(null,"No existe Usuario");
            }
        }
    });

        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre=txtUsuarioRegistrado.getText();
                String correo=txtCcorreoRegistrado.getText();
                char[] pass1 = txtContrasenaRegistrado.getPassword();
                String contra1 = new String(pass1);
                char[] pass2 = txtContraseñaConfRegistrado.getPassword();
                String contra2 = new String(pass2);
                if(contra1.equals(contra2)){
                    if(registroUsuario.buscar(nombre)==null){
                        Usuario usuario=new Usuario(nombre,correo,contra1,Rol.EMPLEADO);
                        registroUsuario.agregarUsuario(usuario);
                    }else{
                        JOptionPane.showMessageDialog(null,"El usuario ya existe");
                    }

                }else{
                    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                }
            }
        });
    }
}
