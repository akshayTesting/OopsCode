package LINKEDLIST;

import java.util.LinkedList;

public class TestLinkedlist {

	public static void main(String[] args) {

		
		LinkedList<String> ll = new LinkedList<>(); 
	    
        ll.add("Geeks"); 
        ll.add("Geeks"); 
        ll.add(1, "For"); 
    
        System.out.println(ll); 
        
        LinkedList<String>l=new LinkedList<>();
        l.add("Techical");
        l.add("Languages");
        l.add("programming");
        l.add(1,"Free");  // 2 is indicate the index of string is linkedlist
        System.out.println(l);
	}

}
