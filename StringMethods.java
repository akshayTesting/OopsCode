package STRING;

public class StringMethods 
{

	public static void main(String[] args) 
	
	{
	
		String s="Maharashtra";
		System.out.println(s);
		System.out.println("Length of String is"+" "+s.length());
		System.out.println("it will contains"+" "+s.isEmpty());
		System.out.println("We will Print Maharashtra in Capital latter" + " "+s.toUpperCase());
		System.out.println("We will Print Maharashtra in Small latter" + " "+s.toLowerCase());
		System.out.println("It wil Start with Maha is  "+" "+s.startsWith("Maha"));
		System.out.println("String will end with Tra"+" "+s.endsWith("tra"));
		System.out.println("charchator of string at position 4 th"+" "+s.charAt(4));
		System.out.println("index of string is"+" "+s.indexOf('a'));
		System.out.println("index of stirng is end "+" "+s.lastIndexOf('a'));
		System.out.println("sub string of "+" "+s.substring(4));
		System.out.println("sub string of Maharashtra is "+" "+s.subSequence(0, 11));
		
	System.out.println("================================================================");
	
	String a="Hello";
	String b="Bye";
	System.out.println("check equality of both string are"+" "+a.equals(b));
	System.out.println(a.equalsIgnoreCase(b));
	}
}
