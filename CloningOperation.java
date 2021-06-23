package ObjectClass_Propert;

import java.util.ArrayList;

public class CloningOperation 
{
public static void main(String[] args)
{

	
	ArrayList a=new ArrayList();
	a.add(50);
	a.add(60);
	a.add(30);
	a.add(80);
	System.out.println("address of Array of A is"+" "+a);
	ArrayList a1=(ArrayList)a.clone();
	System.out.println("Address of Array of A1 is "+" "+a1);
	a1.remove(2);
	System.out.println("Address of Array of A1 is "+" "+a1);
	
}
}
