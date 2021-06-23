package STACK;

import java.util.Stack;

public class STACK_DEMO {

	public static void main(String[] args)
	{
	
		Stack<String> name=new Stack<String>();
		name.push("akshay");
		name.push("raj");
		name.push("haggie");
		name.push("praggi");
		name.push("oggy");
		Stack num=new Stack();
		num.push("All");
		num.push("Greak");
		num.push("objects");
		System.out.println(num);
		System.out.println(name);
		System.out.println("stack list  size ="+" "+name.size());
		
		System.out.println("The element at the top of the"
                + " stack is: " + name.peek());
		
		System.out.println("The element at the top of the"
                + " stack is: " + num.peek());
		
		System.out.println("The element at the remove of the"
                + " stack is: " + name.pop());
		
		// Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                           + name);
     // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                           + num);
	}

}
