package ARRAY;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Array 
{

	public static void main(String[] args)
	{
	
		System.out.println("String Array");
		String car[]= {"wMW","ABC","VOLVO","MAHINDRA","TATA","NANO"};
		Arrays.sort(car);
		  
		for (int i = 0; i < car.length; i++) 
		{
		System.out.println(car[i]);	
		}
		System.out.println("size of array is "+car.length);
		System.out.println("=========================================");
		System.out.println("Forword Array ");
		int a[]= {10,30,20,50,90,80};
		Arrays.sort(a);   // orderwise
	   for (int i = 0; i < a.length; i++) 
	   {
		System.out.println(a[i]);
	   }
	   System.out.println("size of array is "+a.length);
	   System.out.println("===========================================");
	   System.out.println("Reverse Array list");
	   for (int i = 5; i>=0; i--) 
	   {
		   System.out.println(a[i]);
	   }
	   System.out.println("size of array is "+a.length);
	   
}
}