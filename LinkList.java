package LINKEDLIST;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args)
	{

		
		LinkedList<String> li=new LinkedList<>();
		li.add("C");
		li.add("C#");
		li.add("Java");
		li.add("HTML");
		li.add("CSS");
		li.add("Angular");
		System.out.println(li);
		System.out.println("Size of LinkedList is = "+" "+li.size());
		System.out.println("=========================================================================================");
		System.out.println("Here We use addFirst and addLast methods");
		li.addFirst("JavaScript");
		li.addLast("NodeJs");
		System.out.println(li);
		System.out.println("=========================================================================================");
		Collections.shuffle(li);
		System.out.println("Shuffle Method used");
		System.out.println(li);
		System.out.println("=========================================================================================");
		li.remove("NodeJs");
		System.out.println("Remove Method is Used");
		System.out.println(li);
		System.out.println("=========================================================================================");
			System.out.println("Remove First and Last Method");
			li.removeFirst();
			li.removeLast();
			System.out.println(li); 
			System.out.println("=========================================================================================");
			System.out.println("Orderwise ");
			Collections.sort(li);
			System.out.println(li);
		
	}

}
