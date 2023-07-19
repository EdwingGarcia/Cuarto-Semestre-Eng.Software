import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lista collection=new Lista();
        collection.add_value(10);
        collection.add_value(80);
        collection.add_value(120);
        collection.add_value(90);
        collection.addFirst(2);
        for(int i=0;i<1000;i++){
            collection.add_value(new Random().nextInt(5000));
        }
        System.out.println(collection.listSize());
        System.out.println(collection.toString());
        System.out.println(collection.addition());

        Integer value=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Datito"));
        int index=collection.binarySearch(value);
        Integer valorBusquedaSecuencial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato a buscar por busqueda seuencial"));

        if(index!=-1){
            System.out.println("Dato esta en indice "+index);
        }else{
            System.out.println("nuay");
        }
        System.out.println( "---"+collection.searchSecu(valorBusquedaSecuencial));


















    }
}
