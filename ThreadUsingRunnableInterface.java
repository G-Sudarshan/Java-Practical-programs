// Program for thread

class ThreadUsingRunnableInterface implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running ");
	}

	public static void main(String[] args) {
			
		ThreadUsingRunnableInterface obj = new ThreadUsingRunnableInterface();

		Thread t1 = new Thread(obj);

		t1.start();
	}

}