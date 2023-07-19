public class Auto {
    private int anio;
    private String marca;

    public Auto(int anio, String marca) {
        this.anio = anio;
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  "Auto:" +
                "\nMarca:" + marca+
                "\nAño:" + anio+
                "\n---------------" ;



    }
}
