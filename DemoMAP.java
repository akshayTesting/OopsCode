package MAPS;

import java.util.HashMap;
import java.util.Map;

public class DemoMAP
{

	public static void main(String[] args) {
		
		
		Map<Integer, String> hm1=new HashMap<>();
		
		Map<Integer, String> hm2=new HashMap<Integer,String>();
		
		hm1.put(1, "Akshay");
		hm1.put(2, "Vijay");
		//System.out.println(hm1);
		hm2.put(new Integer(3),"Oggy");
		hm2.put(new Integer(4), "Raj");
		System.out.println(hm1);
		System.out.println(hm2);
	}
}
