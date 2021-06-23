package VECTORS;

import java.util.Collections;
import java.util.Vector;

public class Boklist
{

	public static void main(String[] args) {
			
		
		Vector<String> book=new Vector<String>();
		book.add("Physics");
		book.add("Chesmistry");
		book.add("Math");
		book.add("Biologys");
		book.add("Economic");
		book.add("Psychologys");
		book.add("botney");
		
		System.out.println("Size of vectorList is ="+" "+book.size());
		System.out.println("Before sorting The Vector list is");
		System.out.println(book);
		System.out.println("After sorting The Vector list is");
		Collections.sort(book);
		System.out.println(book);
		System.out.println("First Book Name Is"+" "+book.firstElement());
		System.out.println("Last Book Name Is"+" "+book.lastElement());
		book.remove(6);
		System.out.println(book);
		book.hashCode();
		System.out.println(book.get(1));

	}
}
