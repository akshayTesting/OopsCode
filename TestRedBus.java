package LambdaExpression;

public class TestRedBus 
{
public static void main(String[] args) 
{
	RedBus narmdabus=(double seat, double price)->
	{
		double offer=200;
		System.out.println("Ticket price is "+" "+price );
		System.out.println(" seleceted seat are"+" "+seat);
		double totalBill=price*seat;
		System.out.println("Totall bill You have to paid"+" "+totalBill);
		System.out.println("After applyed coupen");
		totalBill=totalBill-offer;
		System.out.println("Totall bill You have to paid"+" "+totalBill);
		
	};
	
	narmdabus.Book(2, 500);

	
}
}
