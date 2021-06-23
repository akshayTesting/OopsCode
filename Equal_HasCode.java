package ObjectClass_Propert;

public class Equal_HasCode
{

	
	public static void main(String[] args) 
	{
	
		String a="Akshay";
		String b="Akshay";
		
		if (a.equals(b))  //checking the equality of objects using equals() methods
		{
System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());  
	          
		}
		String c="Mario";
		String d="Mario";
		if (!c.equals(d))
		{
			System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());
		}
	}
}
