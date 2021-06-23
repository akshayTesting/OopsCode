package HASHSET;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class DemoHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> country=new HashSet<String>();
		
		country.add("India");
		country.add("India");
        country.add("Australia");
        country.add("South Africa");
        country.add("India");
        country.add("Brazzel");
        country.add("Shrilankha");
        country.add("Pakistan");
        System.out.println(country);
        System.out.println("===================================================================================");
        
        country.remove("Pakistan");
        System.out.println(country);
        System.out.println("===================================================================================");

        Iterator <String>i=country.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next()+" ");
        	
        }
        System.out.println("===================================================================================");
        country.add("Russia");
      System.out.println( country.contains("India"));
        System.out.println(country);
        
       

	}

}
