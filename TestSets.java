package SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSets {

	
	public static void main(String[] args) {
		
		
		Set<String> city=new HashSet<String>();
		city.add("Latur");
		city.add("Pune");
		city.add("Kolhapur");
		city.add("Mumbai");
		System.out.println(city);
		
		System.out.println("Retraving element in set");
		Iterator i=city.iterator();
		while (i.hasNext())
		{
		
			System.out.println(i.next());
		}
	}
}
