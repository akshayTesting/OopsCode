package QUEUES;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import STRING.stringBufferS;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> lang=new PriorityQueue<>();
		lang.add("C");
		lang.add("C#");
		lang.add("Java");
		lang.add("JavaScript");
		lang.add("AdvanceJava");
		lang.add("HTML");
		lang.add("CSS");
		lang.add("NodeJS");
		lang.add("Angular");
		lang.add("OOPS");
		lang.add("C++");
		lang.add("Kostlin");
		System.out.println(lang);
		System.out.println("Size of Queue is "+" "+lang.size());
		String head=lang.peek();
		System.out.println("Head of Queue is "+" "+head);
		System.out.println(" list is Empty"+" "+lang.isEmpty());
		lang.remove("Kostlin");
		System.out.println(lang);
		System.out.println("Poll Method "+" "+lang.poll());
		System.out.println(lang);
		System.out.println("Retraving Element in Queues");
		Iterator it=lang.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());	
		}
		
	}

}
