package Annonymous_class;

public class Test_Bike {

	public static void main(String[] args) 
	{

		Bike b1=new Bike("Yahama H2","Yahama",1500000)
				{
			
			
			@Override
			void buy()
			{
				System.out.println("Bike name is "+BikeName);
				System.out.println("Bike company is "+company);
				System.out.println("Bike price is "+price);
			}
				};
				b1.buy();
				b1.emi(5000);
	}

}
