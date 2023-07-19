
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ListaProducto {
     LinkedList<Producto> listaProducto;

     public ListaProducto() {
         listaProducto = new LinkedList<>();
     }

   //  public LinkedList<Producto> listaCategoria(){}
     //public LinkedList<Producto> subcategoria(){}
     //public LinkedList<Producto> organizar_por_precio(){}
     //public LinkedList<Producto> organizar_por_relevancia(){}

     public LinkedList<Producto> organizar_por_descuento(){
          Comparator<Producto> comparador= new Comparator<Producto>() {
               @Override
               public int compare(Producto producto1, Producto producto2) {
                    if (producto1.getDescuento() > producto2.getDescuento()) {
                         return -1;
                    } else if (producto1.getDescuento() < producto2.getDescuento()) {
                         return 1;
                    }
                    return 0;
               }
          };
          Collections.sort(listaProducto, comparador);
          return listaProducto;
     }

     public Producto buscar_Producto(String nombre){
          for(Producto p:listaProducto){
               if(p.getNombre().equals(nombre)){
                    return p;
               }
          }
          return null;
     }
}
