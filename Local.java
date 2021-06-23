package Thread_Object;

public class Local implements Runnable 
{
	String name="samsung";
	int price=5000;
	
	public void run()
	{
		System.out.println("mobile name is "+" "+name);
		System.out.println("mobile price is"+" "+price);
	}
	public static void main(String[] args) throws InterruptedException 
	{
	
		Local l=new Local();
		Thread t=new Thread(l);
		t.start();
		Thread.sleep(2000);
		//t.start();  we can call start method only once
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
	}

}
