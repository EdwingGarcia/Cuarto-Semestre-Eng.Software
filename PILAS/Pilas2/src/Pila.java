import java.util.Stack;

public class Pila {
    private Stack<Publicacion> pila;//se maneja objetos tipo Publicacion


    public Pila(){
        pila=new Stack<Publicacion>();
    }//Instanciar el objeto

    public void push(Publicacion dato){
        pila.push(dato);
    }//agregar dato a la pila
    public Publicacion pop() throws Exception{
        if(pila.isEmpty()){
            throw new Exception("pila esta vacia");
        }
        return pila.pop();
         }//arroja exception cuando no hay elementos y elimina en caso de haber minimo 1

    public Publicacion top() throws Exception{
        if(pila.isEmpty()){
            throw new Exception("pila esta vacia");
        }
        return pila.peek();
    }//retorna el elemento que esta en la cima de la pila

    @Override
    public String toString() {
        String resultado="";
        for (int i=pila.size()-1;i>=0;i--){
            resultado+=pila.get(i).toString()+"\n";

        }
        return resultado;//recorre toda la pila y arroja los resultados
    }
}
