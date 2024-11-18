package CollectionIntereface.Map;
import java.util.*;

public class TreeMap1 {
    public static void main(String args[]){
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(10,"ten");
		tm.put(1,"one");
		tm.put(5,"five");
		tm.put(7,"seven");
		System.out.println(tm); // {1=one, 5=five, 7=seven, 10=ten}
		
        tm.put(1,"gogo");

    //     tm.put(null,"lk");
    // System.out.println(tm);//R.E NullPointerException

        tm.put(4,null);
        System.out.println(tm);
        
    }
}
