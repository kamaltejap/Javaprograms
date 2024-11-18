package Arrays;

public class MissingEle {
    public static void main(String args[])
    {
        int [] arr={6,5,7,4,9,3};

        int small=arr[0];
        for(int i:arr){
            if(i<small)
                small=i;
        }

        int n=arr.length+1;//missing number also
        
        int allsum= n*(n+1)/2+(n*(small-1));

        for(int i:arr){
            allsum=allsum-i;
        }

        int num=allsum;
        
        System.out.println("Number is : "+num);
    }
}
 
    