import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lista {
    private List<Integer> list;

    public Lista() {
        list=new ArrayList<>();
    }
    public void add_value(Integer value){
        if (!list.contains(value))
            list.add(value);
            Collections.sort(list);
    }
    public void addFirst(Integer value){
        list.add(0,value);
    }
    public Integer deleteIndex(int index){
        return list.remove(index);

    }
    public int listSize(){
        return list.size();
    }

    public int binarySearch(Integer value){
        if(value<list.get(0)||value>list.get(list.size()-1)){
            return -1;//indica que no exite en la coleccion
        }
        return __binarySearch(value);
    }
    private int __binarySearch(Integer value){
        int sup,low,mid,getValue;
        low=0;
        sup=listSize()-1;
        int cont=0;
        while(sup>=low){
            mid=(low+sup)/2;
            cont++;
            getValue=list.get(mid);
            if(getValue==value){
                System.out.println("**"+cont);
                return mid;
            }if(value<getValue){
                sup=mid-1;
            }else{
                low=mid+1;
            }
        }

        return -1;
    }

    private Integer __recursiveAdittion(int actualIndex){
        if(actualIndex>=listSize()){
            return 0;
        }
        return  __recursiveAdittion(actualIndex+1)+list.get(actualIndex);
    }
    public int searchSecu(Integer value){
        int cont=0;
        for(int i=0;i<listSize();i++){
            if(value==list.get(i)){
                return cont;
            }
            cont++;
        }
        return 0;
    }

    public Integer addition(){
        return __recursiveAdittion(0);
    }
    @Override
    public String toString() {
        String acum="";
        int i=1;
        for(Integer x:list){
            acum+=x+"\t";
            if(i%10==0){
                acum+="\n";
            }
            i++;
        }
        return acum;
    }
}
