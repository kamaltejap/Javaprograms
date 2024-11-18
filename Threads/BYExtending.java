package Threads;

class Mythread extends Thread{
    public void run()
    {
        for(int i=0;i<=5;i++){
            System.out.println("Child-Thread");
        }
    }
}
public class BYExtending {
    public static void main(String args[])
    {
        //instatitate a thread
        Mythread t= new Mythread();

        //start a thread
        t.start();

        for(int i=0;i<=5;i++)
        {
            System.out.println("Parent-thread");
        }
    } 
}
