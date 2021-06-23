package SingleToneClass;

public class Test_Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instagram tablet=Instagram.getInstagram();
System.out.println("Tablet::"+tablet);
tablet.upload(10);
System.out.println("******************************************");
Instagram computer=Instagram.getInstagram();
System.out.println("computer::"+computer);
computer.upload(12);
	}

}
