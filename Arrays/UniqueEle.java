package Arrays;

public class UniqueEle {
    public static void main(String args[])
    {    
        int[] arr={2,3,2,4,5,6,7,9,3,43,4};

        for(int i=0;i<arr.length;i++)
        {
            int cnt=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                }
            }
            if(cnt==1)
               System.out.println(arr[i]+" ");
        }
    }  
}
