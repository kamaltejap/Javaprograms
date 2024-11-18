package CollectionIntereface.List;
import java.util.*;

public class Vector1 {
    public static void main(String args[])
    {

        /*
        same as ArrayList But
        All methods present in Vector are SYNCHRONIZED.
        and having defULT Capacity is 10
         addElement()
	     removeElementAt()
	     removeAllElements()
	     firstElement()
	     lastElement()

         */

        Vector<Integer> v=new Vector<Integer>();
    
        System.out.println(v.capacity());//10

        for(int i=1;i<=v.capacity();i++){
            v.addElement(i);
        }
        System.out.println(v);

        System.out.println(v.firstElement());//1
        System.out.println(v.lastElement());//10

        v.removeElementAt(5);//index 5
        System.out.println(v);

        v.removeAllElements();
        System.out.println(v);
    
    }
    
}
