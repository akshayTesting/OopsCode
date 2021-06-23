package Inheritance.Multi_Level;

public class Test_local {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Local l1=new Local();
l1.buy();
Thread.sleep(5000);
System.out.println("******************************");
onlineshop o1=new onlineshop();
o1.buy();
Thread.sleep(5000);
System.out.println("******************************");
o1.sell(2);
Thread.sleep(5000);
System.out.println("******************************");
seller s1=new seller();
s1.selle(2);
Thread.sleep(5000);
s1.buy();
Thread.sleep(5000);
s1.buy();
Thread.sleep(5000);
s1.sell(2);

	}

}
