package Hierachical;

public class Calculator
{
double a;
double b;
void detail() {
	System.out.println("Value of A is ::::"+a);
	System.out.println("Value of B is ::::"+b);
}
}
class demo extends Calculator
{
	void addtion(double a,double b )
	{
		System.out.println("addition Result is ::"+(a+b));
	}
	
}
class Data  extends demo
{
	void sub(int a, int b)
	{
		System.out.println("Subtraction Result is ::"+(a-b));
	}
}
class Result extends Data
{
	void div(int a, int b)
	{
		System.out.println("Division Result is ::"+(a/b));
	}
}