 package Arrays;

public class LeaderEles {
    
    public static void main(String args[])
    {
        int [] arr={2,34,2,14,5,6,1};

        int max=arr[arr.length-1];
        System.out.println(max);
        
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
               System.out.println(max);
            }
        }             
    }
}
