package Hierachical;

public class Test_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator c1=new Calculator();
		c1.detail();
		System.out.println("*************************");
		
		demo d1=new demo();
		d1.detail();
		d1.addtion(10, 30);
		System.out.println("***************************");
		Data d=new Data();
		d.addtion(10, 20);
		d.detail();
		d.sub(500, 230);
		System.out.println("***************************");
		Result r=new Result();
		r.sub(100, 50);
		r.addtion(100, 10);
		r.detail();
		r.div(100,2);
		
	}

}
