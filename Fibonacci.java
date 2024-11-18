import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        fabino();
        fabino();
    }
    public static void fabino(){

        Scanner g=new Scanner(System.in);
        int n=g.nextInt();
        int a =0;
        int b =1;
       // for(int i=1;i<=n;i++){
       do{
            System.out.print(a+" ");
            int sum = a+b;
            a=b;
            b=sum;
            n--;
        }while(n>0);
        System.out.println();

        }
        

    }
    

