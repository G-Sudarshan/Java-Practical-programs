// 	Simple program to show class object relationship

class Box 
{
	double w,h,d;
	void display()
	{
		double vol = w*h*d;
		System.out.println("volume : "+vol);
	}
}


class BoxDemo
{
	public static void main(String[] args) {
		Box mybox = new Box();
		mybox.w = 10;
		mybox.h = 20;
		mybox.d = 30;
		mybox.display();
	}

}