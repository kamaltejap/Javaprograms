package CollectionIntereface.List;
import java.util.*;

public class LinkedList1 {
    public static void main(String args[]){

        LinkedList ll = new LinkedList();

        ll.add("one");
        ll.add("two");
        System.out.println(ll);
        /*
        The underlying data structure is doubly LinkedList.
         public void addFirst(E);
  	     public void addLast(E);
         public E getFirst();
  	     public E getLast();
     	 public E removeFirst();
  	     public E removeLast();
         */
        ll.addFirst("start");
        ll.addLast("end");

        System.out.println(ll);

        System.out.println("ll.get(3) : "+ll.get(3));

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
    }
    
}
