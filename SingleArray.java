package ARRAY;

public class SingleArray {

	public static void main(String[] args)
	{
		
		Double a[] =new Double[7];
		a[0]=5.0;
		a[1]=2.0;
		a[2]=4.0;
		a[3]=3.0;
		a[4]=1.0;
		a[5]=8.0;
		a[6]=8.0;
		System.out.println(a[6]);
		System.out.println(a.length+" "+ "size of Array ");
		int b=6;
		while(b>=0)
		{
			System.out.println(a[b]);
			b--;
		}

		int c[]=new int[6];
		c[0]=1;
		c[1]=5;
		c[2]=4;
		c[3]=7;
		c[4]=8;
		c[5]=9;
		
		System.out.println("Size of interger array is "+" " +c.length);
		for (int i = 0; i < c.length-1; i++)
		{
		System.out.println(c[i]);	
		
		}
		
		
	}

}
