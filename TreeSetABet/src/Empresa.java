
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Empresa {
    private Set<Empleado> set;
    private Comparator<Empleado> comparadorCedula;
    private int step;

    public Empresa() {
        comparadorCedula = Comparator.comparing(Empleado::getCedula);
        set = new TreeSet<>(comparadorCedula);
    }

    public boolean agregarEmpleado(Empleado empleado) {
        if (!set.contains(empleado)) {//verifica si ya existe un empleado con una cedula identica
            set.add(empleado);//se agrega al set
            return true;//si se agrega retorna true
        }
        return false;//en caso de que exista un empleado con la misma cedula retorna false
    }

    public String enlistarTodosEmpelados() { //Imprime los datos personales del empleado
        StringBuilder listaEmp = new StringBuilder();
        String titles = "Cédula\tNombre\tSalario\n";
        listaEmp.append(titles);
        for (Empleado e : set) {//recorre_todo el set y va construyendo el string adjuntando todos los datos de los empleados
            listaEmp.append(e.imprimirDatos() + "\n");
        }
        return listaEmp.toString();//retorna la lista completa
    }

    public String enlistarTodo() { //Imprime todos los datos  del empleado (Incluye aportes y impuestos)
        StringBuilder listaEmp = new StringBuilder();
        String titles = "Cédula\tNombre\tSalario\tAporte\tImpuestos\n";
        listaEmp.append(titles);
        for (Empleado e : set) {//recorre todo el set y va construyendo el string adjuntando todos los datos de los empleados
            listaEmp.append(e.imprimirTodo() + "\n");
        }
        return listaEmp.toString();//retorna la lista completa
    }

    public Empleado buscarEmpleado(int cedula) {
        int inferior, superior, centro;
        inferior = 0;
        superior = set.size() - 1;
        this.step = 0;

        while (inferior <= superior) {
            centro = (inferior + superior) / 2;
            Empleado emp = (Empleado) set.toArray()[centro];
            this.step++;
            if (cedula == emp.getCedula())
                return emp;
            if (cedula < emp.getCedula()) {
                superior = centro - 1;
            } else {
                inferior = centro + 1;
            }
        }
        return null;
    }

    //Comprueba el número de pasos para la función búsqueda
    public void debug() {
        System.out.println("" + this.step);
    }

    public String modificarEmpleado(int cedula,String nombre, float salario) {
        Empleado emp = buscarEmpleado(cedula);
        if (emp != null) {
            emp.setNombre(nombre);
            emp.setSalario(salario);
            return emp.imprimirDatos();
        } else {
            return "No se encontró el empleado";
        }
    }
}
