package Arrays;

public class SubArray {
    public static void main(String [] args){
        int[] arr={1,4,2,3,7,6,5,1};

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==12)
                {
                    for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                 
                    }
                    System.out.println();
                }
            }
        }
    }
}
