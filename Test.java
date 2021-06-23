package MAPS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "C");
		m.put(2, "C#");
		m.put(3, "C++");
		m.put(4, "OOPS");
		m.put(5, "Java");
		m.put(6, "JavaSCript");
		System.out.println(m);
		m.put(new Integer(7), "HTML");
		m.put(new Integer(8), "CSS");
		System.out.println(m);
		System.out.println("Map is empty"+" "+m.isEmpty());
		System.out.println("Remove 7 index element in Map");
		m.remove(new Integer(7));
		System.out.println(m);
		System.out.println("Retraving the element in Map we use iterator");
		for (Map.Entry mapElement : m.entrySet()) {
            int key
                = (int)mapElement.getKey();
  
            // Finding the value
            String value
                = (String)mapElement.getValue();
  
            System.out.println(key + " : "
                               + value);
        }
		
		
		
	}
}
