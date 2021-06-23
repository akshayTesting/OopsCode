package abstract_class;

public abstract class Data 
{
double a=10;
double b=20;
double c=30;

void details()
{

	System.out.println("Value of A is ::::"+a);
	System.out.println("Value of B is ::::"+b);
	System.out.println("Value of C is ::::"+c);
}
 	 

abstract void add();
abstract void mul();
abstract void div();
abstract void sub();
	
}
