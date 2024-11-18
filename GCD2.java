import java.util.Scanner; 

public class GCD2 {
    public static void main(String args[]){
        gcd();
    }
    public static void gcd(){
        Scanner h=new Scanner(System.in);
        int a=h.nextInt();
        int b=h.nextInt();
        int gcd=0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD is :"+gcd);
    }
}
