package Method_OverLoading;

public class HDFC
{
double InsuranceAmount=6000;
double paidAmount=0.0;
void Pay(double amount)
{
	System.out.println("Yearly Insurance Amount is ::"+InsuranceAmount);
	System.out.println("Now You Had  Payed Amount Is::"+amount);
	if (amount>=InsuranceAmount)
	{
		paidAmount=paidAmount+amount;
	System.out.println("Your EMI Payment Succesfull");	
	}
	else
	{
	System.out.println("Sorry.....! Insuffient Balance Please Maintain Suffient Balance");	
	}
}
}
class Phonepe extends HDFC
{
	@Override
	void Pay(double amount)
	{System.out.println("Make Payment Through PhonePe");
		super.Pay(amount);
		
	}
	
}