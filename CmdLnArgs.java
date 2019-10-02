// Program for additio of two no. using commandline argument

class CmdLnArgs
{
	public static void main(String[] args) {
		System.out.println("Cocatenation of strings : "+ ( args[0] + args[1]) );
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a+b;

		System.out.println("Addition of nummbers : "+sum);
	}

}