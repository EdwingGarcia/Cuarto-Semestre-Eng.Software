public class Persona implements  Comparable<Persona>{
    String nombre;
    String tramite;
    int prioridad;

    public Persona(String nombre, String tramite, int prioridad) {
        this.nombre = nombre;
        this.tramite = tramite;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    @Override
    public int compareTo(Persona nueva){
        if(this.prioridad<nueva.getPrioridad()){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", tramite='" + tramite + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}
