import java.util.Scanner;

public class PrimeMethod {
    public static void main(String args[]){

        Scanner h=new Scanner(System.in);
        int n=h.nextInt();
        
          if(prime(n))
          System.out.println("Prime");
          else
          System.out.println("Not");

    }
    public static boolean prime(int n)
    {
           boolean b=true;
           
            for(int i=2;i<=(int)Math.sqrt(n);i++){
                if(n%i==0){
                    b=false;
                    break;
                }
            }
               return b;

            
        }
    }
    
    

