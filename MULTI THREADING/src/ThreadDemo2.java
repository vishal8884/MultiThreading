class Hi1 implements Runnable
	{
		public void run()
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
		}
	}
	
	class Hello1 implements Runnable
	{
		public void run()
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
		}
	}
	
	public class ThreadDemo2 {

	public static void main(String[] args) {
		
		Hi obj1= new Hi();
		Hello obj2= new Hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
		
		//obj1.show();
		//obj2.show();

	}

}