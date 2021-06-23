package abstract_class;

public abstract class Facebook
{
	String username="akshay";
	String password="akshay@!@#$%";
	int salaray=50000;
	void details()
	{
		System.out.println("user details");
	System.out.println("Username is ::"+username);
	System.out.println("Password is ::"+password);
	System.out.println("salaray is ::"+salaray);
	}
	 abstract void comapany();
	 abstract void branch();
	 abstract void city();
}
