package CollectionIntereface.CursorsINJava;
import java.util.*;
public class Iterator1 {
    /*
      Iterator is used to read objects one by one from any Collection object.Hence it is a universal cursor.
    Using Iterator we can perform read and remove operations.
    We can create Iterator object as follow.
	    Iterator itr=al.iterator();
    Iterator interface contains following three methods.
	    public boolean hasNext();
	    public Object next();
	    public void remove();
     */
    public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);//[1,2,3,4,5,6,7,8,9,10]
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			if(i%2==0)
				System.out.println(i+" ");
			else
				itr.remove();
		}
	
		System.out.println(al);//[2,4,6,8,10]
        /*
         * Limitations with Iterator
        Using Enumeration and Iterator we can read objects only in forward direction but not in backward direction.Hence they are not bi-directional cursors.
        Using Iterator we can perform read and remove operations but not adding and replacement of new object.
        To overcome this limitation Sun Micro System introduced ListIterator.
         */
    }
}
