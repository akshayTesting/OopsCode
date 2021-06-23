package Thread_Object;

public class Test_Demo 
{
public static void main(String[] args) {
	Demo d0=new Demo();
	Demo d1=new Demo();
	Demo d2=new Demo();
	System.out.println(d0.getName()+" "+d0.getState());
	System.out.println(d1.getName()+" "+d1.getState());
	System.out.println(d2.getName()+" "+d2.getState());
	d0.start();
	System.out.println(d0.getName()+" "+d0.getState());
	System.out.println(d1.getName()+" "+d1.getState());
	System.out.println(d2.getName()+" "+d2.getState());
	d1.start();
	System.out.println(d0.getName()+" "+d0.getState());
	System.out.println(d1.getName()+" "+d1.getState());
	System.out.println(d2.getName()+" "+d2.getState());
	d2.start();
	System.out.println(d0.getName()+" "+d0.getState());
	System.out.println(d1.getName()+" "+d1.getState());
	System.out.println(d2.getName()+" "+d2.getState());
}
}
