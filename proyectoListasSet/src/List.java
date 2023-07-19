import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class List {
    private Set <Paquete> listPackage;

    public List() {
        listPackage=new LinkedHashSet<>();
    }

    public void addPackage(Paquete newPackage){
        listPackage.add(newPackage);
    }

    //search all the packages of one city, when you have the owner name

    public ArrayList searchCity_Owner(String city,String ownerName){
        ArrayList result= new ArrayList();
        for(Paquete packageX:listPackage){
            if(packageX.getCity().compareToIgnoreCase(city)==0
                && packageX.getOwnerName().compareToIgnoreCase(ownerName)==0){
                result.add(packageX);
            }
        }
        return result;
    }

    //search the package with a TrackingNumber
    //the trackingNumber needs to be sorted
    //BinarySearch

    private Paquete searchTrackingNum(int trackingNum)throws Exception{
        int lower=0,higher=listPackage.size()-1,mid;
        while(higher>=lower){
            mid=(higher+lower)/2;
            Paquete centralPackage=(Paquete)listPackage.toArray()[mid];
            if(trackingNum==centralPackage.getTrackingNum()){
                return centralPackage;
            }
            if(centralPackage.getTrackingNum()>trackingNum){
                higher=mid-1;
            }
            if(centralPackage.getTrackingNum()<trackingNum){
                lower=mid-1;
            }
        }
        throw new Exception("No exite paquete con ese numero de tracking");
    }

    public Paquete search(int trackingNum)throws Exception{
        if(trackingNum<((Paquete)listPackage.toArray()[0]).getTrackingNum()||trackingNum>((Paquete)listPackage.toArray()[listPackage.size()-1]).getTrackingNum() ){
            throw new Exception("No existe el Tracking Num.");
        }else{
            return searchTrackingNum(trackingNum);
        }
    }

// Summing weights of a city passed as a parameter
// Recursion

   private float recursiveAdditionWeight(String city,int index){
       Paquete actualPackage=((Paquete)listPackage.toArray()[index]);
       //base case
        if(index>=listPackage.size()){
            return 0;
        }
        if(actualPackage.getCity().compareToIgnoreCase(city)==0){
          return actualPackage.getWeight()+recursiveAdditionWeight(city,index+1);

        }else{
            return recursiveAdditionWeight(city,index+1);
        }
   }
   public float sum(String city){
        return recursiveAdditionWeight(city,0);
   }


}
