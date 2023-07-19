import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class MainPaProbarTO {
    public static void main(String[] args) {
        Empresa empresa=new Empresa();

        Random random = new Random();
        List<Empleado> empleados = new ArrayList<>();
        for(int i = 0; i <= 5000; i++) {
            empleados.add(new Empleado(random.nextInt(), cadenaAleatoria(8), random.nextFloat() * 1000));
            empresa.agregarEmpleado(empleados.get(i));
        }

        List<Empleado> empleados2 = new ArrayList<>();
        List<String> empleadosModificados = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            empleados2.add(empresa.buscarEmpleado(empleados.get((int)Math.pow(i, 2)).getCedula()));
            System.out.println("\nPasos de la busqueda\n");
            empresa.debug();
            empleadosModificados.add(empresa.modificarEmpleado(empleados.get(i).getCedula(), cadenaAleatoria(8), random.nextFloat()));
        }

        System.out.println("Empleados buscados \n" + empleados2.stream().map(x -> x.imprimirDatos()).collect(Collectors.joining("\n")));
        System.out.println("\nEmpleados modificados\n" + empleadosModificados.stream().map(x -> x).collect(Collectors.joining("\n")));

        System.out.println("\nEnlistar todo:\n" + empresa.enlistarTodosEmpelados() + "\n");
        System.out.println("\nEnlistar datos\n" + empresa.enlistarTodo() + "\n");
    }

    public static String cadenaAleatoria(int longitud) {
        // El banco de caracteres
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
