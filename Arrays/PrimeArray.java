package Arrays;

public class PrimeArray {
    public static void main(String args[]){

        int[] arr={2,4,5,6,7,9,8,3};
        
        int sum=0;
               
        for(int n:arr)
        {
            int cnt=0;
            for(int i=1;i<=n;i++){
                 if(n%i==0){
                    cnt++;
                 }
            }
             if(cnt==2){
                System.out.println(n);
                 sum=sum+n;
             }
             
        } 
            System.out.println("Sum is :"+sum);
    }
    
}
