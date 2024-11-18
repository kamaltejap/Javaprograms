package Recursion1;

public class Reaching1 {

    public static void main(String args[]){
             int result=reach(3);

    }   
     public static int reach(int n){

        if(n==1){
            return 1;
        }
        if(n%2==0){
            System.out.println(n/2);
            return reach(n/2);
        }
        else{
            System.out.println((n*3)+1);
            return reach((n*3)+1);
        }
        
    }
    
}
