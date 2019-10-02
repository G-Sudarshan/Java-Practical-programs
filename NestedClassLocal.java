// Program for Local Nested Class

class Outer
{
	int i,count=1; 
	void display()
	{
		for(i=0;i<5;i++)
		{
			class Inner
			{
				void show()
				{
				System.out.println("Inside Inner Class "+count);
				count++;
			    }
			}

			Inner in = new Inner();
			in.show();
		}

		
	}
}

class NestedClassLocal
{
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.display();
	}
	
}