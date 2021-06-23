package Method_OverLoading;

public class Test_flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FlipKart k1=new FlipKart();
		k1.Buy(1);
		System.out.println("*******************************************");
		Amezon a=new Amezon();
		a.Buy(1);
		System.out.println("*******************************************");
		a.AddToCart(1);
	}

}
