package SingleToneClass;

public class Test_Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Booking phone=Booking.getBooking();
		System.out.println("Phone::"+phone);
		phone.book(5);
		System.out.println("*****************");
		Booking laptop=Booking.getBooking();
		System.out.println("laptop:"+laptop);
		laptop.book(10);
		
	}

}
