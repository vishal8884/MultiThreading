

class Q
{
	int num;
	boolean valueSet = false;
	
	public synchronized void put(int num)
	{
		while(valueSet)
		{
			try {wait(); } catch(Exception e){}
		}
		System.out.println("put : "+ num);
		this.num=num;
		valueSet = true;
		notify();
	}
	public synchronized void get()
	{
		while(!valueSet)
		{
			try {wait(); } catch(Exception e){}
		}
		System.out.println("get : "+num);
		valueSet=false;
		notify();
	}
}


class Producer implements Runnable
{
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t1=new Thread(this,"Producer");
		t1.start();
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			try { Thread.sleep(1000); } catch(Exception e){}
		}
	}
	
}

class Consumer implements Runnable
{
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t2=new Thread(this,"Producer");
		t2.start();
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
			try { Thread.sleep(1000); } catch(Exception e){}
			
		}
	}
}







public class InterThreadThread8th {

	public static void main(String[] args) {
		
		
		Q q=new Q();
		
		
		new Producer(q);
		new Consumer(q);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
