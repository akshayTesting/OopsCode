package VECTORS;

import java.util.Collections;
import java.util.Vector;

import STRING.stringBufferS;

public class VECOTORLIST
{

	
	public static void main(String[] args) 
	{
	
		Vector<String> animal=new Vector<String>();
		animal.add("tiger");
		animal.add("lions");
		animal.add("elphent");
		animal.add("dog");
		animal.add("raat");
		animal.add("robat");
		animal.add("deer");
		System.out.println("Size of vectorlist"+ " "+animal.size());
		System.out.println(animal);
		Collections.sort(animal);
		animal.addElement("kutra");
		animal.addElement("sneak");
		animal.addElement("whitelions");
		animal.addElement("egles"); 
		
		System.out.println("after sorting elements");
		System.out.println(animal);
		   System.out.println("Size after addition: "+animal.size());  
		System.out.println("capacity of list is "+" "+animal.capacity());
		if (animal.contains("raat"))
		{
		
			System.out.println("Tiger is present at the index " +animal.indexOf("tiger"));  
		}
		else {
		 System.out.println("Tiger is not in list" );  
		}
		
		
		System.out.println("The first animal of the vector is ="+" "+animal.firstElement());
		System.out.println("The last animal of the vector is ="+animal.lastElement());
	}
}
