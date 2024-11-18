package Arrays;

public class SumEle {
    public static void main(String args[])
    {
        int [] arr={2,4,6,7,4,3,5};

        int sum=0;
       
        //for each loop
        for(int i:arr)
        {
            sum=sum+i;
            
            if(i%2==0){
                System.out.print("Even :");
                System.out.println(i+" ");
            }
        }
        System.out.println(sum);

    }
}
