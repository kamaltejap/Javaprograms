package Arrays;

public class SubMaxSum {
    public static void main(String args[]){
        int [] nums = {4,4,-8,5,8,-99};
        //    int maxsum=nums[0];
        //     int j1=0;
        //    for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){

        //         sum=sum+nums[j];

        //         if(sum>maxsum){
        //             maxsum=sum;
        //         }
        //     }
        //    }
                int maxCount=nums[0];
                int sum=nums[0];
                for(int i=1;i<nums.length;i++)
                {
                    if(sum>0)
                    {
                        sum = sum+nums[i];
                    }
                    else
                    {
                        sum=nums[i];
                    }
                  
                    if(sum>maxCount){
                        maxCount=sum;
                    }
                }
           System.out.println(maxCount);


    }
    
}
