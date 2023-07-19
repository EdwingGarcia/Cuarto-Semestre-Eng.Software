public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String correo;
    private Rol rol;

    public Usuario(String nombreUsuario, String contrasena, String correo, Rol rol) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.rol = rol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
