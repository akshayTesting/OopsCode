package Inheritance.Multi_Level;

import INTERFACE.sample1;
import Implementation_class.sample;

public class Test_Sample {

	public static void main(String[] args) 
	{
		sample1 s1=new sample1();
		s1.test();
		
		System.out.println("****************");
    INTERFACE.sample s=new sample1(); 
    s.test();
    System.out.println(sample.a);
		

	}

}
