package CollectionIntereface.Set;
import java.util.*;

public class LinkedHash2 {
    public static void main(String args[]){
        int[] arr={1,2,2,3,3,3,3,4,4};

        Set<Integer> s=new LinkedHashSet<Integer>(); 

        //for each loop
        for(int i:arr){
            s.add(i);
        }

        //forEach Method
        s.forEach(ele -> System.out.print(ele+" "));
    }
}
