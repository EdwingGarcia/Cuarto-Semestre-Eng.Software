public class Paciente implements Comparable <Paciente>{

private int prioridad;
private String nombre;
private String enfermedad;

    public Paciente(int prioridad, String nombre, String enfermedad) {
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.enfermedad = enfermedad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }


    @Override
    public String toString() {
        return "Paciente: \n Prioridad: "+prioridad+
                "\nNombre: "+nombre+
                "\nEnfermedad: "+enfermedad;
    }

    @Override
    public int compareTo(Paciente nuevo) {
        if(this.prioridad<nuevo.getPrioridad()){
            return 1;
        }else{
            return -1;
        }
    }
}
