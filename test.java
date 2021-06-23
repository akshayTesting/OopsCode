package BLOCKS;

public class test 
{

	{
		System.out.println("Common part of constructors invoked !!");
		
	}
	public test()
	{
		System.out.println("Default Constructor");
		
	}
	public test(int x)
	{
		System.out.println("parameterise constructor");
		
	}
	public static void main(String[] args) 
	{
	 test obj1,obj2;
		obj1 =new test();
		obj2=new test(10);
		
		
	}
}
