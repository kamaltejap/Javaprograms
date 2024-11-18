import java.util.*;
public class PrimeNum2 {
    public static void main(String args[]){
        Scanner g=new Scanner(System.in);
        int n =g.nextInt();
        int a=3;
        boolean flag=true;

        for(int i=2;i<n;i++){
            if(n%i==0){  
              flag=false;
              break;
            }
      
          }
         if(flag==true)
         System.out.println("its a prime");
         else
         System.out.println("not");
    }
}
