package Annonymous_class;

public abstract class Car
{
String carModel;
String carCompany;
double price;
double emi=50000.0;


public Car(String carModel,String carCompany,double price)
{
	this.carCompany=carCompany;
	this.price=price;
	this.carModel=carModel;
}
  void Emipay(double Amount)
  {
	  
	  System.out.println("Car Model is  "+carModel);
	  System.out.println("Car Company is "+carCompany);
	  System.out.println("car price is "+price);
	  if (emi==Amount) 
	  {
		  System.out.println("Your As per Month EMi is Successfull");
	  }
	  else
	  {
		  System.out.println("Sorry...! You insifffiente balace to pay emi");
	  }
	 
  }
  abstract void buy();
}
