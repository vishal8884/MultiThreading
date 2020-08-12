

class Counter
{
	int count;
	
	public synchronized void increment() //synchronized keyword allows this method to be accessed indidually
	{
		count++;
	}
}


public class SyncDemoThread7 {
	
	public static void main(String[] args) throws InterruptedException
	{
		Counter c =new Counter();
		//c.increment();
		//c.increment();
		
		Runnable obj1 = () ->
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		};
		
		Runnable obj2 = () ->
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		};

		
		Thread t1= new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println("count "+c.count );
		
	}

}
