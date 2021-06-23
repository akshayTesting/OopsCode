package SingleToneClass;

public class Booking 
{
double ticketprice=100;
static Booking b;
private Booking()
{
System.out.println("Ticket Booking start");	
}
void book(double seat)
{
	System.out.println("Total Booking seat are:::"+seat);
	ticketprice=ticketprice*seat;
	System.out.println("Total Booking Ticket price::"+toString());
}
static public  Booking getBooking()

{
	if (b==null)
	{
		b=new Booking();	
	}
	return b;

}

}
