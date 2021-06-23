package ObjectClass_Propert;

import java.sql.Array;
import java.util.ArrayList;

public class cloneDuplicate
{
public static void main(String[] args)
{

	
	ArrayList a1=new ArrayList();
	a1.add("Vijay");
	a1.add("sachine");
	a1.add("Raj");
	a1.add("Praggi");
	a1.add("Akshay");
	a1.add(null);
	System.out.println("Address of ArrayList of A1 is"+" "+a1);
	
	//object clonning
	ArrayList a2=(ArrayList)a1.clone();
	a2.remove(5);
	System.out.println("Address of ArrayList of A2 is "+" "+a2);
	
}
}
