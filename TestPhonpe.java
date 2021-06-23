package LambdaExpression;

public class TestPhonpe 
{
public static void main(String[] args) 
{
PhonPe phone=(double unlimited,String operator,double plan)->
	{	

		System.out.println("Your Sim oprator is "+" "+operator);
		System.out.println("Your Sim Recharge plan is "+" "+plan);
		System.out.println("Your recharge data is "+" "+unlimited);
	};
	phone.rechare(1.50, "Airtel", 399);
	System.out.println("========================================================");
	
	PhonPe jio=(double unlimited,String oprator,double plan)->
	{
	
		String operator="jio";
		System.out.println("Your Sim oprator is "+" "+operator);
		System.out.println("Your Sim Recharge plan is "+" "+plan);
		System.out.println("Your recharge data is "+" "+unlimited);
		
	};
	jio.rechare(2.00, "JioPhone", 599);
}
}