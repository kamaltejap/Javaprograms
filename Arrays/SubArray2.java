package Arrays;

public class SubArray2 {
    public static void main(String[] args){

        int[] arr={1,4,2,3,7,5};

        for(int i=0;i<arr.length;i++){
            int sum=0,cnt=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==12){
                    cnt++;
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                 }
            }
            //if we want only one subarray
            if(cnt==1){
                break;
            }
        }
    }
    
}
