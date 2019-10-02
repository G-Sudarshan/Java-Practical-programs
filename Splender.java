// Program for upcasting : reference variable of parent class refers to object of child class 

class Bike
{
	void run()
	{
		System.out.println("running");
	}

}

class Splender extends Bike
{
	void run()
	{
		System.out.println("Running safely with 60km");
	}

	public static void main(String[] args) {
		
		Bike b = new Splender();
		b.run();
	}

}