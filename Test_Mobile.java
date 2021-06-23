package Annonymous_class;

public class Test_Mobile {

	public static void main(String[] args)
	{

		
		Mobile m=new Mobile("samsung",10000) 
		{
			
			@Override
			void details() 
			{
				System.out.println("Mobile Company is "+device);
				System.out.println("Mobile price is "+price);
				
			}
		};
		m.details();
	}

}
