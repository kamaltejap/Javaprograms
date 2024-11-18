import java.util.Scanner;
public class PrimeNum {
   public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int n =sc.nextInt();
    
     int count=0;
     //boolean flag = true;
     if(n>1){
          for(int i=1;i<=n;i++){
                 if(n % i == 0){
                 count++;//flag =false;break;
                 }
          }
        if(count==2){
             System.out.println("its a Prime");
         }
         else{
             System.out.println("Not a prime");
        }
      }
     else{
      System.out.println("Not Prime");
     } 
   }  
}
