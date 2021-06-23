package ArrayList;

import java.util.ArrayList;

public class lists
{ 

	public static void main(String[] args)
	{
	
		
		ArrayList< Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(6);
		a.add(9);
		a.add(10);
		a.add(11);
		a.add(500);
		
		System.out.println("Fresh list"+" "+a);
		System.out.println("Length of list is "+" "+a.size());
		
	System.out.println("after remove the element from list"+" "+a.remove(6));
	System.out.println(a);
	
	
	a.set(5, 15);    // we set 5 in 11 position of arraylist 
	System.out.println(a);
	a.trimToSize();
	System.out.println(a);
	a.clear();
	System.out.println(a);
	}
	}

