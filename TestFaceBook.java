package SingleToneClass;

public class TestFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FaceBook laptop=FaceBook.getFaceBook();
		System.out.println("Laptop::"+laptop);
		laptop.Upload(2);
		System.out.println("************************************************");
		FaceBook mobile=FaceBook.getFaceBook();
		System.out.println("Mobile ::"+mobile);
		mobile.Upload(3);
	}

}
