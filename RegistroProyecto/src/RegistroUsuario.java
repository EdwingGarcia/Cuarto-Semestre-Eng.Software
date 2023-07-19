import java.util.ArrayList;
import java.util.List;

public class RegistroUsuario {
    private List<Usuario> listaUsuarios;

    public  RegistroUsuario(){
        Usuario usr = new Usuario("admin", "admin", "---", Rol.ADMINISTRADOR);
        listaUsuarios=new ArrayList<>();
        listaUsuarios.add(usr);
    }
    public void agregarUsuario(Usuario usr){
        listaUsuarios.add(usr);
    }
    public Usuario buscar(String nombre){
        for(Usuario u:listaUsuarios){
            if(u.getNombreUsuario().equals(nombre)){
                return u;
            }
        }
    return null;
    }
    public void crearCuenta(String nombreUsr, String contra, String correo) {
        Usuario empleado = new Usuario(nombreUsr, contra, correo, Rol.EMPLEADO);
        listaUsuarios.add(empleado);
    }
    public boolean verificarCredencialesAdmin(String nombreUsuario, String contrasena) {
        Usuario admin = buscar(nombreUsuario);
        if (admin != null && admin.getRol() == Rol.ADMINISTRADOR && admin.getContrasena().equals(contrasena)) {
            return true;
        }
        return false;
    }
}
