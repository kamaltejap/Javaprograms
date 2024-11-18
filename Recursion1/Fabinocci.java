package Recursion1;

import java.util.Scanner;
public class Fabinocci {
    public static void main(String args[])
    {
        Scanner g=new Scanner(System.in);
        int n=g.nextInt();

         System.out.println(fabino(n));     
    }
    public static int fabino(int n)
    {   
        if(n==0||n==1 )
            return 0;
        
         if(n==2)
          return 1;
        
        return fabino(n-1)+fabino(n-2);  
       
        
    }
    
}
