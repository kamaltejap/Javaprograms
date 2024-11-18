package Recursion1;

public class PrintNum {
    public static void main(String args[]){
          int n=10;//n=1;

          printnum(n);

    }
    public static void printnum(int n){

        if(n==0)//n==11
            return;
        System.out.print(n+" ");
        printnum(n-1);//n+1
    }
    
}
