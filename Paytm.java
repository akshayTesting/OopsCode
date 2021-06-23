package Method_OverLoading;

public class Paytm
{
	String operator="Jio";
	double recharge=599;
	double total_Bill=0.0;
	void pay(double set)
	{
		System.out.println("Oprator Name is ::"+operator);
		System.out.println("Recharge Plane Price is ::"+recharge);
		System.out.println("Recharge on Device ::"+set);
		total_Bill=recharge*set;
		System.out.println("Yor recharge is Succesfull ::"+total_Bill);
	}
}
class Airtel extends Paytm
{
	

	double offer=100;
	@Override
	void pay(double set)
	{
		System.out.println("Oprator Name is ::"+operator);
		System.out.println("Recharge Plane Price is ::"+recharge);
		System.out.println("Recharge on Device ::"+set);
		total_Bill=recharge*set;
	
		total_Bill=total_Bill-offer;
		System.out.println("After Appling OfferCode You will Get Discount::"+offer);
		System.out.println("Yor recharge is Succesfull ::"+total_Bill);
		
	}
	String operator="Airtel";
	double recharge=699;
	double total_Bill=0.0;
	void PayOnAirtel(double set)
	{
		System.out.println("Oprator Name is ::"+operator);
		System.out.println("Recharge Plane Price is ::"+recharge);
		System.out.println("Recharge on Device ::"+set);
		total_Bill=recharge*set;
		System.out.println("Yor recharge is Succesfull ::"+total_Bill);
		System.out.println("After Appling OfferCode You will Get Discount::"+offer);
		total_Bill=total_Bill-offer;
		System.out.println("Yor recharge is Succesfull ::"+total_Bill);
	}
}
