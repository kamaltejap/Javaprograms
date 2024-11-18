package CollectionIntereface.List;
import java.util.*;

public class ArrayAsList {
    public static void main(String[] args) 
	{
        //<datatype> is generics
		List<Integer> list=Arrays.asList(7,3,9,1,2,5);

		System.out.println(list);

        List<String> strList=Arrays.asList("one","two","Three");

        System.out.println(strList);

        List<String> sl= new ArrayList<String>();
		sl.add("hi");
        sl.add("hello");
        System.out.println(sl);
	}

}
