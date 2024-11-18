package CollectionIntereface.List;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) 
	{
        ArrayList<String> arrl=new ArrayList<String>();
        
		arrl.add("HTML");
		arrl.add("CSS");
		arrl.add("JAVA");
    

        //arrl.add(index,ele);
        arrl.add(0,"JS");

        //arrl.set(index,ele)
        arrl.set(2,"Css");

        System.out.println("al.get(index:2) : "+arrl.get(2));

        System.out.println("al.indexOf(ele:HTML) : "+arrl.indexOf("HTML"));

        
        
        List<String> larr =new ArrayList<String>();
        larr.add("SQL");
        larr.add("BACK");
        larr.add("JAVA");

        arrl.retainAll(larr);//[JAVA] INTERSECTION

        System.out.println("arrl Intersection larr : "+arrl);

        arrl.addAll(larr);

        for(int i=0;i<arrl.size();i++)
            System.out.print(arrl.get(i)+" ");
        
        /*
        The underlying data structure is resizable array or growable array.
        Duplicate objects are allowed.
        Insertion order is preserved.
        Hetrogeneous objects are allowed.
        Null insertion is possible. 
        It implements List, Serializable,Cloneable and RandomAccess interface.
        And methods are not SYNCHRONIZED  
        */


    }
}
