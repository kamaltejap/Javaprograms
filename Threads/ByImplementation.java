package Threads;

class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;i++){
            System.out.println("child");
        }
    }
}

public class ByImplementation {
    public static void main(String args[]){

        MyRunnable r=new MyRunnable();

        Thread t=new Thread(r);// r is a targetable interface
        
        t.start();
        for(int i=0;i<=5;i++){
            System.out.println("Preant");
        } 
    }  
}
