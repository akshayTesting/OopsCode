package Implementation_class;

public class Test_Sample {

	public static void main(String[] args)
	{
	sample1 s=new sample1();
	s.test();
	//upcasting
	sample s1=(sample) s;
	s1.test();
	System.out.println(sample1.a);

	}

}
