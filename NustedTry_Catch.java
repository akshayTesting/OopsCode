package EXCEPTIONS;

public class NustedTry_Catch 
{

	public static void main(String[] args) 
	{
	
		
		int a=10;
		int b=0;
		int c=0;
		int arr[]=new int [3];
		arr[0]=9;
		arr[1]=6;
		arr[2]=3;
//		arr[3]=4;
//		arr[4]=7;
//		arr[5]=8;
		
		
		try
		{
		System.out.println("Outer Try Block");	
		try 
		{
		System.out.println("Inner Try Block");
		arr[5]=2;
		System.out.println("Inner Try Block End");
		}
		catch (ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("AIOB Exception handled");
			
		}
		c=a/b;
		} 
		
		catch (ArithmeticException e)
		{
		System.out.println("ArithmeticException handled");
		}
		System.out.println("Division Result is "+" "+c);
		System.out.println("Element Of Array ");
		for (int i = 0; i < arr.length; i++)
		{
		System.out.println(arr[i]);	
		}

	}
}
