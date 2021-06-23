package Method_OverLoading;

public class CinemaHall
{
double ticket_Price=200.0;
double totall_Bill=0.0;
void book(double seat)
{
	System.out.println("Offline Booking CinemaHall");
	System.out.println("Selected seat are::"+seat);
	totall_Bill=seat*ticket_Price;
	System.out.println("You Have To Pay Total Bil is ::"+totall_Bill);
			
}
}
class BookMyShow extends CinemaHall
{double offer=50.0;
	@Override
	void book(double seat)
	{
		System.out.println("Offline Booking CinemaHall");
		System.out.println("Selected seat are::"+seat);
		totall_Bill=seat*ticket_Price;
		
		System.out.println("You Have To Pay Total Bil is ::"+totall_Bill);
		System.out.println("You can Apply Offer code is ::"+offer);
		totall_Bill=totall_Bill-offer;
		System.out.println("You Have To Pay Total Bil is ::"+totall_Bill);
				
	}
	
}
