package Arrays;
import java.util.*;

public class KeyMaxsum {
    public static void main(String args[]){
    
        int [] arr={1,2,6,7,8,9};
        
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();

        int maxs=0;
    
        for(int i=0;i<arr.length-key+1;i++)
        {
            int sum=0;
            for(int j=i;j<key+i;j++)
            {
                sum=sum+arr[j];
            }
            if(sum>maxs)
                maxs=sum;
        } 
    
        System.out.println(maxs);
}
}
