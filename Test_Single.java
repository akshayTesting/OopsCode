package Inheritance;

public class Test_Single {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Single_Level s1 =new Single_Level();
		s1.details();
		System.out.println("********************************");
		expands e1=new expands();
		e1.details();
		System.out.println("*******************************");
		e1.sub(300, 100);
		System.out.println("*******************************");
		e1.div(50, 20);
	}

}
