package ObjectClass_Propert;

public class HASCODE_EQUALS
{
public static void main(String[] args) 
{


	String A="MARIO";
	String B="MARIO";
	if (A.equals(B))   //checking  the equality of objects using equals() method  
	{
	
		System.out.println("A and B value and their hasCode value"+" "+A.hashCode()+" "+B.hashCode());
		//System.out.println(A.getClass());
	}
	
	String C="SUPERMARIO";
	String D="SUPERMARIO";
	if (!C.equals(D))     //checking  the equality of objects using equals() method  
	{
		System.out.println("C and D value and their hasCode value"+" "+C.hashCode()+" "+D.hashCode());
		//System.out.println(C.getClass());
	}
}
}
