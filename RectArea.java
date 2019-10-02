// Program to demonstrate Constructor

class Rectangle
{
	int length,width;
	
	Rectangle(int l, int w)
	{
		length = l;
		width = w;
	}

	int area()
	{
		return(length*width);
	}

}

class RectArea
{
	public static void main(String[] args) {
		
		Rectangle r1  = new Rectangle(10,20);
		int res = r1.area();
		System.out.println("Area is : "+res);
	}

}