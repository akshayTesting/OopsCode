package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringArraylist
{

	
	public static void main(String[] args) {
			
		
		
		ArrayList<String> movie=new ArrayList<String>();
		
		movie.add("Razz");
		movie.add("Aapne");
		movie.add("Jani dushmaan");
		System.out.println(movie.size());
		System.out.println(movie);
		Collections.sort(movie);
		System.out.println("After sorting list");
		System.out.println(movie);
		
		
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("pink");
		colors.add("Black");
		colors.add("White");
		colors.add("Cyon");
		
		
		System.out.println("List size are" +" "+colors.size()  );
		System.out.println(colors);
		System.out.println("After sortings list");
		  Collections.sort(colors);  
		  System.out.println(colors);
	}
}
