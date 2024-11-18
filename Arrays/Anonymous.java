 package Arrays;
public class Anonymous {
    public static void main(String args[]){ 

        System.out.println(sumOfArray(new int[]{1,2,3,4,5}));
    }
    
    public static int sumOfArray(int[] arr){

        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        return sum;
        

}
}
