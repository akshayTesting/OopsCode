package EXCEPTIONS;

public class Demo 
{

	public static void main(String[] args) 
	{
	
		
		int a=100;
		int b=2;
		int c = 0;
		System.out.println("value of A is "+" "+a );
		System.out.println("value of B is "+" "+b );
		try 
		{
			 c = a/b;
		} 
		catch (Exception e) 
		{
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
				
		}
		System.out.println("Divided Result is "+" "+c);
}
}