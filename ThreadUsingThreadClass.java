// Program for threads

class ThreadUsingThreadClass extends Thread
{
	public void run()
	{
		System.out.println("Thread running");
	}

	public static void main(String[] args) {
		
		ThreadUsingThreadClass t1 = new ThreadUsingThreadClass();
		t1.start();
	}

}