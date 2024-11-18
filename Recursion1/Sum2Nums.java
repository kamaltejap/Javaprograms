package Recursion1;

import java.util.Scanner;
public class Sum2Nums {
    public static void main(String args[]){
       Scanner h=new Scanner(System.in);
       int a= h.nextInt();
       int b=h.nextInt();

       System.out.println("sum is :"+ sum(a,b));

    }
    public static int sum(int a,int b)
    {
        if(a==0)
            return b;

        return sum(--a,++b);

    }
    
}
