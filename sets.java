package SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sets 
{

	public static void main(String[] args) {
		
		Set<String> alpha=new HashSet<>();
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");
		alpha.add("F");
		alpha.add("H");
		alpha.add("I");
		alpha.add("J");
		alpha.add("K");
		System.out.println(alpha);
		System.out.println("A value is contains in set"+" "+alpha.contains("A"));
		System.out.println("Z value is contains in set"+" "+alpha.contains("Z"));
		System.out.println("====================================================");
		System.out.println("Remove Method");
		alpha.remove("K");
		System.out.println(alpha);
		System.out.println("====================================================");

		for (String items : alpha)
		{
		
            System.out.print(items + ", ");

			System.out.println();
		}
		

		
	}
}
