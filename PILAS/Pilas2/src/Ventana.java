import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtCodigo;
    private JTextField txtTitulo;
    private JTextArea txtMensaje;
    private JButton botonIngresar;
    private JButton botonMostrar;
    private JTextArea txtBlog;
    private JButton botonEliminar;
    Pila blog=new Pila();//se lo coloca aqui debido a que si se lo pone en un boton se reincia
    public Ventana() {
        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo=Integer.parseInt(txtCodigo.getText());//se asigna a las variables lo escrito en los Jtext
                String titulo=txtTitulo.getText();
                String mensaje=txtMensaje.getText();
                Publicacion post=new Publicacion(codigo,titulo,mensaje);//instanciamos Publicacion
                blog.push(post);//se agrega a la pila objeto tipo Publicacion
                txtBlog.setText(blog.toString());//se muestra en txtBlog cada post nuevo
            }
        });

        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Publicacion elemento=blog.top();
                    JOptionPane.showMessageDialog(null,elemento.toString());
            }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }//se usa try y catch debido a que se maneja una excepcion
            }
        });
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Publicacion eliminar = blog.pop();
                    JOptionPane.showMessageDialog(null,"Eliminado exitosamente");
                    txtBlog.setText(blog.toString());
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
