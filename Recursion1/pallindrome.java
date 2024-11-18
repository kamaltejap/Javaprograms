package Recursion1;

import java.util.Scanner;
public class pallindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        
        int k=pallin(n,rev);
        if(k==n)
        System.out.println(k +": palin");
        else
        System.out.println(k+": Not");

    }
    public static int pallin(int n,int rev){
        
         if(n>0)
         { 
            rev=rev*10+n%10;
            return  pallin(n/10,rev);   
        }
        else
         return rev;   
    }

    
}
