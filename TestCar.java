package Annonymous_class;

public class TestCar {

	public static void main(String[] args) 
	{

		
		Car c=new Car("Scorpio", "mahindra", 1000000) 
		{
		@Override
		void buy()
		{
			System.out.println("car campany is"+carCompany);
			System.out.println("car model is "+carModel);
			System.out.println("car price is "+price);
		}
		};
		
		c.buy();
		System.out.println("***************************************");
		c.Emipay(5000);
	}

}
