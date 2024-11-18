package Threads;

class MyThreads extends Thread
{

}
public class Priority10 {
    public static void main(String args[])
    {
        System.out.println(Thread.currentThread().getPriority());//5

        MyThreads t=new MyThreads();
        System.out.println(t.getPriority());//5

        Thread.currentThread().setPriority(10);

        System.out.println(Thread.currentThread().getPriority());//10
          
        t.setPriority(4);
        System.out.println(t.getPriority());//4

        //t.setProiority(12); R.E IllegaLArgumentsException

    }    
}
