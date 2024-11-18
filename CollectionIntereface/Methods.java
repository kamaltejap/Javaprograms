package CollectionIntereface;
import java.util.*;

public class Methods {
    public static void main(String args[]){

        ArrayList al=new ArrayList();
        al.add("hi");
        al.add("hello");
        al.add("java");
        al.add(10);

        Collections.sort(al);

        al.remove("java");

        al.contains(10);//true
        al.isEmpty();//false

     System.out.println(al.hashCode());
    

        //Object[]=  toArray();
        Collection l=new ArrayList();
        l.add(10);
        l.add("kamal");
        l.add("you");
       
        al.equals(l);//false
      
        System.out.println(al.containsAll(l));//false (l is subset of al or not) 

        System.out.println(al);
        System.out.println(al.retainAll(l));//true al intersection l
        System.out.println(al);

        al.addAll(l);

         System.out.println("al.size() = "+al.size());

        al.removeAll(l);//[hello]
        al.clear();//[] 

        System.out.println(al);
    }
}
