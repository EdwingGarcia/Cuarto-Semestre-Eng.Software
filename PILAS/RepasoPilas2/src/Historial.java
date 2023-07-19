public class Historial {
    private String nombre;
    private String observacion;
    private String banner;

    public Historial(String nombre, String observacion, String banner) {
        this.nombre = nombre;
        this.observacion = observacion;
        this.banner = banner;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "nombre='" + nombre + '\'' +
                ", observacion='" + observacion + '\'' +
                ", banner='" + banner + '\'' +
                '}';
    }
}
