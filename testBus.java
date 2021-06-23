package LambdaExpression;

public class testBus 
{
public static void main(String[] args)
{

	
	
	Bus b=(double price,double seat)->
	{
	System.out.println("ticket price is "+" "+price);
	double totallAmount=price*seat;
	System.out.println("Total bill to paid is "+" "+" "+totallAmount+" seat are"+" "+seat);
	};
	b.bookseat(300, 2);
	Bus b1=(seat,price)->
	{
	System.out.println("Ticket price are"+" "+price);
	double totalAmount=price*seat;
	System.out.println("Total bill to paid is "+" "+" "+totalAmount+" seat are"+" "+seat);
	};
	b1.bookseat(500, 2);
}
}
