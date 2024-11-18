package CollectionIntereface.Map;
import java.util.*;
public class HashMap1 {
    /*
     The underlying data structure is Hashtable.
    Duplicate key is not allowed but value can be duplicate.
    Insertion order is not preserved because it will take hash code of a key.
    Hetrogeneous objects are allowed for both key and value.
    Null insertion is possible for both key and value.
     */
    public static void main(String args[]){

        HashMap hm= new HashMap();
        
        hm.put("kal","four");
        hm.put(1,"one");
        hm.put("two","four");
        hm.put("three",3);
        hm.put(5,5);
        
        System.out.println(hm);

        hm.put(5,"five");

        hm.put(null,null);

        System.out.println(hm);

        


    }
}
