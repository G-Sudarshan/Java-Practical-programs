// Program for Interface

interface Circle
{
	void area(int r);
}

class InterfaceDemo implements Circle
{
	public void area(int r)
	{
		double res;

		res = 3.14 * r * r;

		System.out.println("Area of cicle  : "+res+" sq. units ");

	}

	public static void main(String[] args) {
		
		InterfaceDemo obj = new InterfaceDemo();

		obj.area(10);
	}

}