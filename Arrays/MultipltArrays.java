package Arrays;

public class MultipltArrays {
    public static void main(String args[])
    {
        int [] arr1={5,3,1};
        int [] arr2={1,4};
        
        int num1=0,num2=0;
        for(int i=0;i<arr1.length;i++){
            num1=num1*10+arr1[i];    
        }
        for(int i:arr2){
            num2=num2*10+i;
        }

        System.out.println(num1*num2);

    }
}
