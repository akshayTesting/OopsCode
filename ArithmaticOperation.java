package SCANNER;

import java.util.Scanner;

public class ArithmaticOperation 
{

	public static void main(String[] args) {
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Your First Value");
		int a=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Your Second Value");
		int b=sc2.nextInt();
		int add=a+b;
		int Diff= a-b;
		System.out.println("Addition of Two Number is "+" "+add);
		System.out.println("Differnce of Two Number is "+" "+Diff);
		
	}
}
