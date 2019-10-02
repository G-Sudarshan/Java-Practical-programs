// Prrogram to demonstrate use of super keyword

class SuperClass
{
	void printMethod()
	{
		System.out.println("Printed in Super Class");
	}

}

class SubClass extends SuperClass
{
	void printMethod()
	{
		super.printMethod();
		System.out.println("Printed in Sub Class");
	}

	public static void main(String[] args) {
		
		SubClass obj = new SubClass();

		obj.printMethod();
	}

}