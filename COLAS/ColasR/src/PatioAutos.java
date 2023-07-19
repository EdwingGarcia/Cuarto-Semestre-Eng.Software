import java.util.LinkedList;
import java.util.Queue;

public class PatioAutos {
    private Queue<Auto> listaAutos;
    public PatioAutos(){
        listaAutos=new LinkedList<Auto>();
    }
    public void encolar(String marca,int anio){
        listaAutos.add(new Auto(anio, marca));
    }
   /*
   public void encolar(Auto aut){
        listaAutos.add(auto);
    }

    */

    public Auto desencolar() throws Exception {
        if(listaAutos.isEmpty())
            throw new Exception ("Lista Vacia");
        return listaAutos.poll();
    }
    public String  listarAutos(){
        String acum="";
        for(Auto x:listaAutos){
            acum+=x.toString()+"\n";
        }
        return acum;
    }


    public String listarPorMarca(String marca) {
        String acum="";
        for(Auto x:listaAutos){
            if(x.getMarca().compareTo(marca)==0)
                acum+=x.toString()+"\n";
        }
        return acum;
    }
}
