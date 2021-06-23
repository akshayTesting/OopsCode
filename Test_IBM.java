package Encapsulation;

public class Test_IBM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
IBM i=new IBM();
System.out.println("EmpolyeeName is ::"+i.getAddress());
System.out.println("EmpolyeeId Is::"+i.getId());
System.out.println("Empolyee Salary is::"+i.getSalary());
System.out.println("Empolyee Profile is ::"+i.getEmployeProfile());
System.out.println("Empolyee Address is::"+i.getAddress());
System.out.println("****************************************************************************");
i.setEmployeName("sushil");
i.setAddress("Pune");
i.setEmployeProfile("NOC Engineer");
i.setId(15);
i.setSalary(50000);
System.out.println("EmpolyeeName is ::"+i.getEmployeName());
Thread.sleep(3000);
System.out.println("EmpolyeeId Is::"+i.getId());
Thread.sleep(3000);
System.out.println("Empolyee Salary is::"+i.getSalary());
Thread.sleep(3000);
System.out.println("Empolyee Profile is ::"+i.getEmployeProfile());
Thread.sleep(3000);
System.out.println("Empolyee Address is::"+i.getAddress());
	}

}
