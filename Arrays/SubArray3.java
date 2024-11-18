package Arrays;

public class SubArray3 {
    public static void main(String [] args){
        int[] arr={1,4,2,3,7,6,5};//put 5 here

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[i]+arr[j]==10){
                System.out.println(arr[i]+" + "+arr[j]+" =10");
               }

            }
        }
    }
    
}
