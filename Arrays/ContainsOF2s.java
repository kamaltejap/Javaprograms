package Arrays;
import java.util.*;

public class ContainsOF2s {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int number=2;
           
        int[]  arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=i+1;

            String s=Integer.toString(arr[i]);

            if(arr[i]<=9){
                if(s.charAt(0)==number)
                    System.out.print(arr[i]+",");
            }
            else{
                if(s.charAt(0)==number ||s.charAt(1)==number){
                    System.out.print(arr[i]+",");
                }
            }
        }
    }
}
