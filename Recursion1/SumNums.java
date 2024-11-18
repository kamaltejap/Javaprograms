package Recursion1;

public class SumNums{
    public static void main(String args[]){
        int i=1,n=10,sum=0;
        sum(i,n,sum);

    }
    public static void sum(int i,int n,int sum){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        sum(i+1,n,sum);
        System.out.print(i+" ");

    }
    
}
