package CollectionIntereface.List;
import java.util.*;

public class ArrListSYNCHRO {

    public static void main(String args[]){

        List<String> list=new ArrayList<String>();

        List<String> synList= Collections.synchronizedList(list);

        synList.add("hi");
        synList.add("hello");

        synList.forEach(ele -> System.out.print(ele+" "));
    }
    
}
