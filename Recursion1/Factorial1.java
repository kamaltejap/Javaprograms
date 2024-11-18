package Recursion1;
import java.util.Scanner;
public class Factorial1 {
  
    public static void main(String args[])
    {

        Scanner h=new Scanner(System.in);
        int n=h.nextInt();

         int k=factorial(n);
         System.out.println(k);
    }
    public static int factorial(int n)
    {    
        if(n<0)
           return -1;
        if(n==0||n==1)
            return 1;

        return n*(factorial(n-1));
    
    }
}
