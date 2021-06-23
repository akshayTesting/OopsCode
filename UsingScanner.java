package EXCEPTIONS;

import java.util.Scanner;

public class UsingScanner 
{
public static void main(String[] args) 
{

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Your Value");
	int a=scan.nextInt();
	System.out.println("Enter Your Value");
	int b=scan.nextInt();
	int c=0;
	try
	{
		c=a/b;
	} catch (Exception e) 
	{
		System.out.println("Arithmatic Exception Handled");
		System.out.println(e.getMessage());
	}
	finally 
	{
	System.out.println("Finally block is Runing");	
	}
	scan.close();
	System.out.println("Divded Result is "+" "+c);
}
}
