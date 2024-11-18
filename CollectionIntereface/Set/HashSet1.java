package CollectionIntereface.Set;
import java.util.*;

public class HashSet1 {
    public static void main(String args[])
    {
        /*
        The underlying data structure is Hashtable.
		Duplicate objects are not allowed.
		Insertion order is not preserved because it will take hash code of an object.
		Hetrogeneous objects are allowed.
		Null insertion is possible.
         */
        HashSet hs=new HashSet();
		hs.add("one");
		hs.add("six");
		hs.add("nine");
		System.out.println(hs);//[nine, six, one]
		
		hs.add("one");
		System.out.println(hs);//[nine, six, one]
		
		hs.add(10);
		System.out.println(hs);//[nine, six, one, 10]
		
		hs.add(null);
		System.out.println(hs);//[null, nine, six, one, 10]
    }
}
