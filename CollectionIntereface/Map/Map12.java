package CollectionIntereface.Map;
import java.util.*;

public class Map12 {
    /*
     It is not a child interface of Collection interface.
    If we want to represent group of individual objects in key and value pair then we need to use Map interface.
    Key and value both must be objects.
    Key can't be duplicate but value can be duplicate.
    Each key and value pair is called single/one entry.
     */
    public static void main(String args[]){

        Map<String,String> map= new HashMap<String,String>();
        map.put("one","hi");
        map.put("two","hell");
        map.put("three","hey");
  
        System.out.println(map.get("two"));
        System.out.println(map.containsKey("one"));

        Set s=map.keySet();
        System.out.println(s);

        Collection c=map.values();
        System.out.println(c);

        Set s1=map.entrySet();
        System.out.println(s1);

		
		for(Map.Entry<String,String> entry:map.entrySet())
		{
			System.out.print(entry.getKey()+" ");
            System.out.print(entry.getValue()+" ");
            System.out.println();

			
		}

    }
}

