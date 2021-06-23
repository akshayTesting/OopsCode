package Inheritance.Multi_Level;

public class Local
{
String fruit="oragans";
double price=100;
String company="desi";
void buy()
{
	System.out.println("fruit name is ::"+fruit);
	System.out.println("price of fruit is ::"+price);
	System.out.println("Name of company is ::"+company);
}
}
class onlineshop extends Local
{
	String mobile="Redmi";
	double price=2000;
	double total=0;
	void sell(int Quantity)
	{
		System.out.println("Mobile name is ::"+mobile);
		System.out.println("Mobile price is :::"+price);
		total=price*Quantity;
		System.out.println("total price is :::"+total);
		
	}
	@Override
	void buy()
	{
		System.out.println("fruit name is ::"+fruit);
		System.out.println("price of fruit is ::"+price);
		System.out.println("Name of company is ::"+company);
	}
}
class seller extends onlineshop
{
	String mobile="onePuls";
	double price=40000;
	double total=0;
	void selle(int Quantity)
	{
		System.out.println("Mobile name is ::"+mobile);
		System.out.println("Mobile price is :::"+price);
		total=price*Quantity;
		System.out.println("total price is :::"+total);
		
}
}
