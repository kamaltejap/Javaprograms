import java.util.Scanner;
public class Fibonacci2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
