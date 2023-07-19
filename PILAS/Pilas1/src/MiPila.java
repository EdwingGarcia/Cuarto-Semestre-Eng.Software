import java.util.Stack;

public class MiPila {

    private Stack pila;
    //almacena objects

    public MiPila(){
        pila=new Stack();
        //creacion del objeto
    }

    public void push(char letra){
        pila.push(letra);
        //inserta un valor a la pila
    }
    public char pop(){
       return (char)pila.pop();//se transforma de objeto a caracter
       //devuelve el ultimo dato que se incerto
    }

    public int tamanio(){
        return pila.size();
        //retorna el tamanio de la pila
    }

    public boolean esVacia(){
        return pila.isEmpty();
        //retorna si esta vacia
    }

    @Override
    public String toString() {
        String resultado="";
        for(int i=tamanio()-1;i>=0;i--){
            resultado+=pila.get(i);
        }
        return resultado;
    }
}
