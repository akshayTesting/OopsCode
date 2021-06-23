package Thread_Object;

public class Mutli  extends Thread
{

	public void run()
	{
		System.out.println("thread is Running...!");
	}
	
	public static void main(String[] args) 
	{
	
		Mutli m=new Mutli();
		//m.start(); // start method internally called Run method
		Thread t=new Thread(m);// using implement Runble Interface
		t.start();
	}
}
