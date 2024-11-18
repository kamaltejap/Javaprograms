package CollectionIntereface;
import java.util.*;

public class Comparator1 {
    /*
    Comparator is an interface which is present in java.util package.
    Comparator interface contains following two methods i.e compare() and equals() method.
    If we depend upon customized sorting order then we need to use Comparator interface.
    ex:
	    public int compare(Object obj1,Object obj2)
		    It returns +ve if obj1 comes before obj2 
		    It returns -ve if obj1 comes after obj2
		    it returns 0 if both objects are same
    Implementation of equals() method is optional because it is present in Object class which is available to the class through inheritance.
    Implementation of compare() method is mandatory. 
     */
    public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<Integer>(new MyComparator());
		ts.add(10);
		ts.add(1);
		ts.add(5);
		ts.add(7);
	//	System.out.println(ts);//[10, 7, 5, 1]

	   System.out.println(ts);//[1, 5, 7, 10]
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return 1;
		else
			return 0;
    }
    
}
