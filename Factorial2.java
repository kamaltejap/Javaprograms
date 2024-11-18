import java.util.*;
public class Factorial2 {
    public static void main(String args[]){
            
        fact();
    }
    public static void fact(){
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int fact=1;
        int i=n;
        while(i>=1){
            fact=fact*i;
            i--;
        }
        System.out.println(fact);
    }
}
