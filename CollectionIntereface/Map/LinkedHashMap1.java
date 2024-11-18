  package CollectionIntereface.Map;
import java.util.*;
public class LinkedHashMap1 {
    /*
     * LinkedHashMap is a child class of HashMap class.
    LinkedHashMap is exactly same as HashMap class with following differences.
    But Insertion order is preserved 
    */
    public static void main(String args[]){
    LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("one","raja");
		lhm.put("six","jose");
		lhm.put("nine","brook");
		lhm.put("five","alan");
		System.out.println(lhm);//{one=raja, six=jose, nine=brook, 
    }   
}
