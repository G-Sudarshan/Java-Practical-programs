// Program for user defined exception 

class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}

class UserDefinedException{
	static void validate(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) {
		try{
			validate(12);
		}catch(Exception e){
			System.out.println("Exception occured : "+e);
		}
		System.out.println("rest code");
	}
}