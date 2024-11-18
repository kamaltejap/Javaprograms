package CollectionIntereface;
import java.util.*;

public class CollectionsClass {
    public static void main(String args[]){
        
        String s="dog bat apple cat";
        
        String[] sarr=s.split(" ");

        List<String> l=Arrays.asList(sarr);

        //Collections is class
        Collections.sort(l);
        System.out.println(l);

        l.forEach(ele -> System.out.print(ele+" "));
    }
    
}
