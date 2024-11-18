package CollectionIntereface.Set;
import java.util.*;

public class LinkedHashSet12 {
    public static void main(String[] args) 
	{
		/*
		It is a child class of HashSet class.
		The underlying data structure is HashTable and LinkedList
		Insertion order is preserved
		 */
		LinkedHashSet lhs=new LinkedHashSet();

		lhs.add("one");
		lhs.add("six");
		lhs.add("nine");
		System.out.println(lhs);//[one, six, nine]
		
		lhs.add("one");
		System.out.println(lhs);//[one, six, nine]
		
		lhs.add(10);
		System.out.println(lhs);//[one, six, nine, 10]
		
		lhs.add(null);
		System.out.println(lhs);//[one, six, nine, 10, null]
		
	}

}
