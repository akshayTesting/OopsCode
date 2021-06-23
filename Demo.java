package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {

	
	public static void main(String[] args) {
		
		
		Queue<Integer> q=new LinkedList<>();
		for (int i = 0; i <11; i++)
		{
		q.add(i);	
		}
		System.out.println("Element in Queue are"+" "+q);
		
		
		int Delete=q.remove();
		System.out.println("Element Remove in Queue "+" "+Delete);
		System.out.println(q);
		int head=q.peek();
		System.out.println("Head of Queue in"+" "+head);
		System.out.println(q);
		int totalSize=q.size();
		System.out.println("Size of Queue is "+" "+totalSize);
		System.out.println(q);
	}
}
