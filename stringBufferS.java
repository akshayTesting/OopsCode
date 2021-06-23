package STRING;

public class stringBufferS 
{

	public static void main(String[] args)
	{
	
		String s=new String("Pune");
		s.concat("Maharastra");
		System.out.println(s);
		
		
		// string buffer

		System.err.println("String Buffer program");
		StringBuffer sb=new StringBuffer("Pune");
		sb.append("Maharashtra");
		System.out.println(sb);
		
		System.out.println("================================");
		StringBuffer sb1=new StringBuffer("abcdefghijklmnopqrstwxyz");
		
		System.out.println(sb1.capacity());
		sb1.append("abcdefghijklmnopqrstwxyz");
		System.out.println(sb1.capacity());
	}
}
