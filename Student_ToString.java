package ObjectClass_Propert;

public class Student_ToString 
{

	int rollNO;
	String name;
	String city;
	
	 Student_ToString(int rollNo,String name,String city)
	{
		this.rollNO=rollNo;
		this.name=name;
		this.city=city;
	}
	 public String toString()
	 {
		return rollNO+" " +city+" "+name;
		 
	 }
	 public static void main(String[] args)
	 {
	
		 Student_ToString l1=new Student_ToString(10, "Akshy", "Latur");
		 Student_ToString l2=new  Student_ToString(20, "vijay", "Pune");
		 System.out.println(l1);
		 System.out.println(l2);
		 
	}
	
}
