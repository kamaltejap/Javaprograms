package CollectionIntereface;
import java.util.*;

import CollectionIntereface.Set.TreeSet1;

public class Iterator1 {
        public static void main(String args[]){

        Collection<Integer> num = new  TreeSet<Integer>();
        num.add(10);
        num.add(3);
        num.add(4);
        num.add(7);

        Iterator<Integer> values= num.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }


    }
}
