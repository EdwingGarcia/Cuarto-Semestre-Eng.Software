public class Estudiante {
    private int codigo;
    private String nombre;
    private int creditos;

    public Estudiante(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public float valorMatricula(){
        return creditos*38.65f;  //cada credito cuesta 38.65
    }

    @Override
    public String toString() {
        return "Estudiante: " +
                "\tCodigo:" + codigo +"\t"+
                "   Nombre:" + nombre +"\t"+
                "   Creditos:" + creditos+"\t";
    }
}
