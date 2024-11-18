package Recursion1;

public class Display{
    public static void main(String args[]){

        display(1);
    }
    public static void display(int n)
    {    
        if(n<=10)
        {
            System.out.print(n+" ");
    
            display(n+1);
        
            System.out.print(n+" ");
        }
    }
    
}
