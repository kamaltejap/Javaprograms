package CollectionIntereface.CursorsINJava;
import java.util.*;
public class ListIterator1 {
    /*
     * It is a child interface of Iterator interface.
    ListIterator is used to read objects only from List Collection objects.
    Using Listiterator we can perform read , remove, adding and replacement of new objects.
    We can create ListIterator object as follow.
	    ListIterator litr=al.listIterator();
    ListIterator interface contains following methods.
	    public boolean hasNext()
	    public Object next()
    	public void remove()
    	public boolean hasPrevious()
    	public Object previous()
    	public int nextIndex()
    	public int previousIndex()
	    public void set(Object o)
    	public void add(Object o)
     */
    public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("bala");
		al.add("venki");
		al.add("chiru");
		al.add("nag");
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			String s=(String)litr.next();
            if(s.equals("bala"))
			{
				litr.set("charan");	
			}
        }

			System.out.println(al);//[charan, venki, chiru, nag]
		
	}

}
