package Threads;

class Mythreds extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().isDaemon());//boolean
            System.out.println("child");
        }
    }
}

public class DaemonThread {
    public static void main(String[] args)
	{
		MyThreads t=new MyThreads();
		
		t.setDaemon(true);
		
		t.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Parent-Thread");
		}
    }
}
