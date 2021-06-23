package ARRAY;

import STRING.stringBufferS;

public class NormalArray {

public static void main(String[] args) {
	
	
	int arr[];
	arr=new int[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	System.out.println("Size of Array is ="  +" "+ arr.length);

	for (int i = 0; i < arr.length; i++)
	{
		 System.out.println("Element at index " + i + 
                 " : "+ arr[i]);     
		 }
	String str1=arr.toString();
	System.out.println(str1);
	int clasinfo1=str1.hashCode();
	System.out.println(clasinfo1);
	
	System.out.println("===============================");
	
	Double a[];
	a=new Double[5];
	a[0]=100.0;
	a[1]=200.0;
	a[2]=300.0;
	a[3]=400.0;
	a[4]=500.0;
	System.out.println("Size of Array is ="  +" "+a.length);
	for (int i = 0; i < a.length; i++) 
	{
	
		System.out.println("Element at index "+" "+i+" "+a[i]);
	}
	
	System.out.println("==========================================");
	
	String[] car;
	car=new String[6];
	car[0]="BMW";
	car[1]="Volvo";
	car[2]="Skoda";
	car[3]="Audio";
	car[4]="Hyndia";
	car[5]="Mahindra";
	
	System.out.println("Size of Array is ="  +" "+ car.length);
	
	for (int i = 0; i < car.length; i++)
	{
	System.out.println("Car number index is "+" "+i+" "+car[i]);	
	}
	System.out.println("================================================");
	String[]s=new String[7];
	s[0]="NoteBook";
	s[1]="Pen";
	s[2]="Marker";
	s[3]="Pencil";
	s[4]="Eraser";
	s[5]="Sharpnar";
	System.out.println("Size of element is =   "+s.length);
	for(int i=0; i<s.length; i++)
	{
		System.out.println("Element at Index  "+" "+i+" "+s[i]);
	}
	 String str=s.toString();
	 System.out.println(str);
	 int classinfo= s.hashCode();
	 System.out.println(classinfo);
}

}
