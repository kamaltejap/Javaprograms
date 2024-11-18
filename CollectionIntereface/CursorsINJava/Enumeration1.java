package CollectionIntereface.CursorsINJava;
import java.util.*;
public class Enumeration1 {
    /*
     Enumeration 
    It is used to read the objects one by one from legacy Collection objects.
    We can create Enumeration object as follow.
	    Enumeration e=v.elements();
    Enumeration interface contains two methods.
	    public boolean hasMoreElements();
	    public Object nextElement();
     */
    public static void main(String args[]){
        Vector v=new Vector();
        for(int i=0;i<=10;i++)
        {
            v.add(i);
        }
        System.out.println(v);

        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            Integer i=(Integer)e.nextElement();
            System.out.print(i+" ");
        /*
         * Limitations with Enumeration
        Enumeration is used to read objects one by one from legacy Collections objects only.Hence it is a not a universal cursor.   
        Using Enumeration we can perform read operation but not remove operation.
        To overcome this limitation Sun Micro System introduced Iterator.
         */
        }
    }
}
