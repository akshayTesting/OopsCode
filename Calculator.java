package abstract_class;

public class Calculator extends Data
{

	@Override
	void add()
	{
		System.out.println("Addtion Result is::::"+(a+b+c));
		
	}

	@Override
	void mul() {
		System.out.println("Multipilcaton Result is::::"+(a*b*c));
		
	}

	@Override
	void div() {
		System.out.println("Division Result is::::"+(a+b+c));
		
	}

	@Override
	void sub() {
		System.out.println("Substraction Result is::::"+(a-b-c));
		
	}

}
