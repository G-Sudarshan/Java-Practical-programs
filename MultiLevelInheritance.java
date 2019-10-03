// Program for multilevel inheritance 


class Level1
{
	protected void show()
	{
		System.out.println("class Level1");
	}
}

class Level2 extends Level1
{
	protected void display()
	{
		System.out.println("class Level2");
	}
}

class MultiLevelInheritance extends Level2
{
	public static void main(String[] args) {
		
		MultiLevelInheritance obj = new MultiLevelInheritance();

		obj.show();
		obj.display();

	}

}