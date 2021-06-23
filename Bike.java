package Annonymous_class;

public abstract class Bike
{
String BikeName;
String company;
double price;
Double BikeEmi=50000.0;
void emi(double amount)
{
	if (BikeEmi==amount)
	{
	System.out.println("Your Bike Emi Is successfull");	
	}
	else
	{
		System.out.println("Sorry..! insafficent Amount to pay Emi");
	}
}
public Bike(String BikeName,String company,double price)
{
	this.BikeName=BikeName;
	this.company=company;
	this.price=price;
	
}

abstract void buy();
}
