package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import STRING.stringBufferS;

public class ListDemo 
{

	
	public static void main(String[] args) {
		
		
		ArrayList<String> hindi=new ArrayList<String>();
		hindi.add("baghi");
		hindi.add("shole");
		hindi.add("aapne");
		hindi.add("tanaji");
		hindi.add("aapne");
		System.out.println("Hindi Movie ");
		Iterator hindimovie=hindi.iterator();
		while (hindimovie.hasNext()) 
		{
			System.out.println(hindimovie.next());
			
		}
		Collections.sort(hindi);
		System.out.println("after sorting");
		System.out.println(hindi);
		hindi.remove(0);
		System.out.println(hindi);
System.out.println("==============================================================================");
		ArrayList<String> english=new ArrayList<String>();
		english.add("fast and furious");
		english.add("talnet");
		english.add("wolf");
		Iterator englishmovie=english.iterator();
		while (englishmovie.hasNext()) {
System.out.println(englishmovie.next());			
		}
		english.addAll(hindi);
		System.out.println(english);
	Collections.sort(english);
	System.out.println("after sorrting");
	System.out.println(english);
	System.out.println(Collections.frequency(english, englishmovie));
	Collections.reverse(english);
	System.out.println(english);
	Collections.swap(english, 0, 1);
	System.out.println(english);
		
		
	
	}
}
