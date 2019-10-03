//Program for Throw keyword

class TestThrow{
	static void validate(int age){
		if(age<18)
			throw new ArithmeticException("not valid");
		else 
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) {
		try{
			validate(14);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest code");
	}
}