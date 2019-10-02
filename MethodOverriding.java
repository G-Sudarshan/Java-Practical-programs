// Program to demonstrate Method overriding

class Sup
{
	int i,j;
	Sup(int a, int b)
	{
		i = a;
		j = b;
	}

	void show()
	{
		System.out.println("i : "+i+"  j : "+j);
	}
	
}

class MethodOverriding extends Sup
{
	int k;
	MethodOverriding(int a, int b, int c)
	{
		super(a,b);
		k = c;
	}

	void show()
	{
		super.show();
		System.out.println("k : "+k);
	}

	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding(10,20,30);

		obj.show();
	}
	
}