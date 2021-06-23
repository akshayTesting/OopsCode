package LINKEDLIST;

import java.util.Collections;
import java.util.LinkedList;

public class DemoLinkedList
{

	
	public static void main(String[] args) 
	{
	
		
		LinkedList<String> name=new LinkedList<String>();
		name.add("C");
		name.add("C#");
		name.add("Mysql");
		System.out.println(name);
		System.out.println("set as first orders given by users");
		name.addFirst("Java");
		name.addLast("Angular");
		name.add("JavaScript");
		System.out.println(name);
		Collections.sort(name);
		System.out.println("After performing sorting operation");
		System.out.println(name);
		name.remove("Mysql");
		name.removeLast();
		System.out.println("after performing Remove opration");
		System.out.println(name);
	}
}
