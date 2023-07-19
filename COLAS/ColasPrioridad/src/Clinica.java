import java.util.List;
import java.util.PriorityQueue;

public class Clinica {// cola con prioridad
    PriorityQueue<Paciente> pacientes;

    public Clinica(){
        pacientes=new PriorityQueue<Paciente>();
    }
    public void encolar(Paciente dato){
        pacientes.add(dato);
    }
    public Paciente desencolar() throws Exception{
        if(pacientes.isEmpty()){
            throw new Exception("No existen elementos");
        }
        return pacientes.poll();
    }

    public Paciente mostrar() throws Exception{
        if(pacientes.isEmpty()){
            throw new Exception("No existen elementos");
        }
        return pacientes.peek();// el que esta en el inicio
    }

    public List<Paciente> listaPacientes(){
        return pacientes.stream().toList();
    }
}

