package Method_OverLoading;

public class FlipKart
{
String device="JBL Sound";
double price=5000;
double total_Bill=0.0;
void Buy(int Quantity)
{
	System.out.println("Device Name is :: "+device);
	System.out.println("Device Price is ::"+price);
	total_Bill=price*Quantity;
	System.out.println("Totall Bill is ::"+total_Bill);
}
}
class Amezon extends FlipKart
{
	double discount=5000;
	String device="Sony Bravia Tv";
	double price=50000;
	double total_Bill=0.0;
	void AddToCart(double Quantity)
	{
		System.out.println("Device Name is :: "+device);
		System.out.println("Device Price is ::"+price);
		total_Bill=price*Quantity;
		System.out.println("Totall Bill is ::"+total_Bill);
		System.out.println("After Apply Coupan You will Get Discount::"+discount);
		total_Bill=total_Bill-discount;
		System.out.println("Totall Bill is ::"+total_Bill);
		
	}
	@Override
	void Buy(int Quantity)
	{
		System.out.println("Device Name is :: "+device);
		System.out.println("Device Price is ::"+price);
		total_Bill=price*Quantity;
		System.out.println("Totall Bill is ::"+total_Bill);
		System.out.println("After Apply Coupan You will Get Discount::"+discount);
		total_Bill=total_Bill-discount;
		System.out.println("Totall Bill is ::"+total_Bill);
	}
	
	
}