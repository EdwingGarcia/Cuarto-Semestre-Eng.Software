import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Estudiante> listadoEstudiantes;// solo va a contener objetos de tipo Estudiante con <Estudiante>

    public Cola(){
        listadoEstudiantes=new LinkedList<Estudiante>();
    }

    public void encolar(Estudiante dato){
        listadoEstudiantes.add(dato);
    }

    public Estudiante desencolar() throws Exception {
       if(listadoEstudiantes.isEmpty()){
           throw new Exception("La cola esta Vacia");
       }
        return listadoEstudiantes.poll(); // DEVUELVE EL ESTUDIANTE QUE SE ELIMINA DE LA ESTRUCTURA
    }

    public Estudiante elementoInicial() throws Exception {
        if(listadoEstudiantes.isEmpty()){
            throw new Exception("La cola esta Vacia");
            }
            return listadoEstudiantes.peek();  //DEVUELVE EL ELEMENTO DEL INICIO SIN ELIMINAR NADA
    }

    @Override
    public String toString() {
        String listado="";
        for(Estudiante estudiante:listadoEstudiantes){
            //Si tiene elementos se ubica en la primera posicion estudiante y recorre todos los elementos de listadoEstudiantes
            listado+=estudiante.toString()+"\n";
        }
        return listado;
    }
}
