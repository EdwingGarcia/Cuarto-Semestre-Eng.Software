import java.util.List;
import java.util.PriorityQueue;

public class Cola {
    PriorityQueue<Persona> colaPrioridad;


    public Cola() {colaPrioridad=new PriorityQueue<Persona>();}

    public void ingresar(Persona p){
        colaPrioridad.add(p);
    }

    public Persona quitar()throws Exception{
        if(colaPrioridad.isEmpty()){
            throw new Exception("Vacia gil");
        }
       return colaPrioridad.poll();
    }

    public Persona mostrar()throws Exception{
        if(colaPrioridad.isEmpty()){
            throw new Exception("Vacia gil");
        }
        return colaPrioridad.peek();
    }

    public List<Persona> listaPerona(){return colaPrioridad.stream().toList(); }
}

