package RANDOM;

import java.util.Random;

public class OTP 
{
public static void main(String[] args) 
{

	Random r=new Random();
	int a=r.nextInt(20);
	System.out.println(a);
	int b=r.nextInt(10);
	System.out.println(b);
}
}
