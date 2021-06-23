package Annonymous_class;

public class testStudent {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String city="Pune";
		String stream="En&Tc";
		
		Student s=new Student("akshay", 80)
		{
			int yearofpassing=2019;
			@Override
			void details() {
				// TODO Auto-generated method stub
				
				System.out.println("name is ::"+name);
				System.out.println("percentage is ::"+percentage);
				System.out.println("Year of passing ::"+yearofpassing);
				System.out.println("Stram ::"+stream);
				System.out.println("Current city ::"+city);
				
				
				
			}
		};
		
		s.details();
		
	}

}
