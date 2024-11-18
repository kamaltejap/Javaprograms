package Recursion1;

public class Power {
    public static void main(String args[]){

        int n=5;
        int x=2;
        System.out.println(power(x,n));
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        
        int k=power(x,n-1);
        int g=x*k;
        return g;//x*power(x,n-1);
    }
    
}
