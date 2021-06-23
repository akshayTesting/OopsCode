package SCANNER;

import java.util.Scanner;

public class Even_Odd_Using_Scanner 
{

public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int a=sc.nextInt();
	System.out.println("Entered Input is "+a);
	if (a%2==0)
	{
	System.out.println("This Entered Input is Even");	
	}
	else
	{
		System.out.println("This is Not Even Number");
	}
}
	
}
