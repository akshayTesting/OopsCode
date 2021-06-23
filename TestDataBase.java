package Annonymous_class;

public class TestDataBase
{

	public static void main(String[] args)
	{
		double salary=50000;
	DataBase d=new DataBase("akshay", "Devloper", "pune") {
		
		@Override
		void details() 
		{
			System.out.println("name is::"+name);
			System.out.println("profile:::"+profile);
			System.out.println("City::"+city);
			System.out.println("salary is ::"+salary);
			System.out.println("");
			
		}
	};
		
		
		d.details();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
