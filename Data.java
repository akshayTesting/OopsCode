package Implementation_class;

public interface Data 
{
double a=10;
double b=20;
 void test();
 
}
class Data1 implements Data
{

	@Override
	public void test() 
	{
	System.out.println("A ki value ::"+a);
	System.out.println("B ki Value::"+b);
	System.out.println("Additional Result::"+(a+b));
		
	}
	
}