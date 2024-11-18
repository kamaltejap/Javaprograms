package CollectionIntereface;
import java.util.*;
public class NumOccurance {
    public static void main(String args[]){
        String s="This is is java class class";
        String[] sarr=s.split(" ");

        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        for(String i:sarr)
        {

            if(map.get(i)!=null){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
       }
        map.forEach((key,value) -> System.out.print(key+"="+value+" "));
    }
    
}
