package Thread_Object;

public class Yeild_Operation extends Thread

{
@Override
public void run() {
	System.out.println("Thread is Running...");
	for (int i = 0; i <=10; i++) 
	{
	System.out.println(i);
	//System.out.println("CHild thread");
	}
}
	
}

