// Program to demonstrate nested class 

class Outer
{
	void display()
	{
		Inner in = new Inner();
		in.show();
	}

	class Inner
	{
		void show()
		{
			System.out.println("Inside Inner class");
		}
	}
}

class NestedClass
{
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.display();
	}
}