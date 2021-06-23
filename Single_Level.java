package Inheritance;

public class Single_Level
{
double a=10;
double b=20;
void  details()
{
	System.out.println(" value of A is ::"+a);
	System.out.println("value of B is ::"+b);
}

}
class expands extends Single_Level
{
	@Override
	void  details()
	{
		System.out.println(" value of A is ::"+a);
		System.out.println("value of B is ::"+b);
		System.out.println("Addition result is:: "+(a+b));
	}
	void sub(double a, double b)
	{
		System.out.println("Subtraction result is:: "+(a-b));
	}
	void div(double a, double b)
	{
		System.out.println("Division Result is ::"+(a/b));
	}
}
