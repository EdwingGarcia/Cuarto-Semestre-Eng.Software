import java.util.Stack;

public class Pila {

private Stack<Historial> pila;

    public Pila() {pila=new Stack<Historial>();}

    public void push(Historial dato){pila.push(dato);}

    public Historial pop() throws Exception{
        if(pila.isEmpty()){
            throw new Exception("pila vacio");
        }
        return pila.pop();
    }

    public Historial top() throws Exception{
        if(pila.isEmpty()){
            throw new Exception("pila vacio");
        }
        return pila.peek();
    }

    @Override
    public String toString() {
        String resultado="";
        for(int i=pila.size()-1;i>=0;i--){
            resultado+=pila.get(i).toString()+"\n";
        }
        return resultado;
    }
}
