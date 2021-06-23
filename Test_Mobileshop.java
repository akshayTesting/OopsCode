package Encapsulation;

public class Test_Mobileshop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		MobileShop m=new MobileShop();
		System.out.println(m.getMobileName());
		System.out.println(m.getBrand());
		System.out.println(m.getPrice());
		System.out.println("************************************************************");
		m.setBrand("Apple");
		m.setMobileName("Iphone 12 max Pro");
		m.setPrice(150000);
		System.out.println("************************************************************");
		System.out.println(m.getBrand());

		System.out.println(m.getMobileName());
				System.out.println(m.getPrice());
	}

}
