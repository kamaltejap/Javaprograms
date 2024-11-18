import java.util.*;

public class factorial 
{ 

    //public static int factorials(int n)
    //{
    //     int factorial = 1;
        
    //     for(int i=n;i>=1;i--)
    //     {
    //         factorial= factorial*i;
        
    //     }
    //     return factorial;
    
    // }
    public static void main(String[] args){
    //     Scanner sc =new Scanner(System.in);
    //     int n=sc.nextInt();
    //     factorials(n);
       

      //  do while loop
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        int i=1;
        do{
         fact=i*fact;
          i++;
            }while(i<=n);{
        System.out.println(fact);
        }
    }
}
