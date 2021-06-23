package Method_OverLoading;

public class Test_Paytm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Paytm p1=new Paytm();
		//p1.pay(2);
		System.out.println("*****************************");
	Airtel a=new Airtel();
	a.pay(2);
	System.out.println("********************************");
	a.PayOnAirtel(2);
	}

}
