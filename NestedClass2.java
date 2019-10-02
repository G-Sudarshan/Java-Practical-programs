// Program to demonstrate nested class

class Outer
{ 
	class Inner
	{
		void show()
		{
			System.out.println("Inside Inner class");
		}
	}
}

class NestedClass2
{
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.show();
	}

}