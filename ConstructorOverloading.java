//Program to demonstrates constructor overloading

class ConstructorOverloading
{
	int sum;
	ConstructorOverloading(int a , int b )
	{
		sum = a+b;
	}

	ConstructorOverloading(int a, int b, int c)
	{
		sum = a+b+c;
	}

	ConstructorOverloading(int a,int b,int c,int d)
	{
		sum = a+b+c+d;
	}

	void display()
	{
		System.out.println("Sum is : "+sum);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj1 = new ConstructorOverloading(10,20);
		ConstructorOverloading obj2 = new ConstructorOverloading(10,20,30);
		ConstructorOverloading obj3 = new ConstructorOverloading(10,20,30,40);

		obj1.display();
		obj2.display();
		obj3.display();
	}

}