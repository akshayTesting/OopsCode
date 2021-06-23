package BLOCKS;

public class testBlock 
{

	
	static int i;
	int j;
	static {
		i=90;
		System.out.println("static block called");
		
	}
	public static void main(String[] args) 
	{
	
		System.out.println(testBlock.i);
	}
}
