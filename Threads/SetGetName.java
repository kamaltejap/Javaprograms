package Threads;

class MyThreads extends Thread
{

}
public class SetGetName {
    public static void main(String args[])
    {
        System.out.println(Thread.currentThread().getName());//main
        

        MyThreads t=new MyThreads();
		System.out.println(t.getName());//Thread-0
		
		Thread.currentThread().setName("Parent-Thread");
		System.out.println(Thread.currentThread().getName());//Parent-Thread
		
		t.setName("Child-Thread");
		System.out.println(t.getName());//Child-Thread
    }
}