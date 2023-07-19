public class Empleado {
    private int cedula;
    private String nombre;
    private float salario;
    private float aporteSeguroSocial;
    private float impuestoRenta;


    public Empleado(int cedula, String nombre, float salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
        this.aporteSeguroSocial=calcularAporteSS();
        this.impuestoRenta=calcularImpuestoRenta();
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSalario() {
        return salario;
    }

    public float getAporteSeguroSocial() {
        return aporteSeguroSocial;
    }

    public float getImpuestoRenta() {
        return impuestoRenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularAporteSS() {
        return (float)0.0935*this.salario ;
    }

    public float calcularImpuestoRenta() {
       float salarioAnual=salario*12;
        if(salarioAnual<=5000){
            return 0;
        }else if(salarioAnual>5000 && salarioAnual<=10000){
            return (float) ((salarioAnual-5000)*0.1);
        }else if(salarioAnual>10000 && salarioAnual<=18000){
            return  (float) ((salarioAnual-10000)*0.2);
        } else{
            return  (float) ((salarioAnual-18000)*0.3);
        }
    }

    public String imprimirDatos() {
        return cedula +
                "\t" + nombre +
                "\t" + salario;
    }

    public String imprimirTodo() {
        return cedula +
                "\t" + nombre +
                "\t" + salario +
                "\t" + aporteSeguroSocial +
                "\t" + impuestoRenta;
    }
}
