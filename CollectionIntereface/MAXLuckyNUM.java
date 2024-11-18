package CollectionIntereface;
import java.util.*;

public class MAXLuckyNUM {
    public static void main(String args[]){
        int [] arr={1,1,2,3,3,3,4,4,5};

       System.out.println(luckyNum(arr));
    }
    public static int luckyNum(int[] arr)
    {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
                map.put(i,1);
        }
        int x=0;
        int max=-1;
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getKey() == entry.getValue())
            {
                x=entry.getKey();
                max=Math.max(x,max);//hieghest of values
            }
        }
        return max;
    }
}
