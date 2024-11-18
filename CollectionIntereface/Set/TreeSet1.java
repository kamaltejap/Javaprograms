package CollectionIntereface.Set;
import java.util.*;

public class TreeSet1 {
    /*
    The underlying datastructure is Balanced Tree.
    Duplicate objects are not allowed.
    Insertion order is not preserved because it will take sorting order.
    Hetrogeneous objects are not allowed. If we try to insert hetrogeneous objects then we will get ClassCastException.
    Null insertion is not possible. If we insert null then we will get NullPointerException.
     */
    static public void main(String args[]){
        TreeSet ts=new TreeSet();
        ts.add(10);
		ts.add(1);
		ts.add(5);
		ts.add(7);
		System.out.println(ts); // [1,5,7,10]
        ts.add(1);//not allowed
        //ts.add("one");
		//System.out.println(ts); // R.E ClassCastException
		//ts.add(null);
		//System.out.println(ts); // R.E NullPointerException
    }
}
