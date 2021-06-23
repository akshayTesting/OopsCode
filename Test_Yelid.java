package Thread_Object;

public class Test_Yelid 
{

	public static void main(String[] args) 
	{
	
		Yeild_Operation y=new Yeild_Operation();
		y.start();
		for (int i = 0; i <=10; i++) 
		{
			Thread.yield();
		System.out.println(i);	
		}
	}
}
