// Program to demonstrate method overloading

class MethodOverloading
{
	void add(int a, int b)
	{
		System.out.println("Sum is : "+(a+b));
	}

	void add(int a, int b, int c)
	{
		System.out.println("Sum is : "+ (a+b+c));
	}

	void add(int a, int b, int c, int d)
	{
		System.out.println("Sum is : "+(a+b+c+d));
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();

		obj.add(10,20);
		obj.add(10,20,30);
		obj.add(10,20,30,40);
	}
}