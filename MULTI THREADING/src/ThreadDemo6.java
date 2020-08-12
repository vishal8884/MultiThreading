
public class ThreadDemo6 {

	public static void main(String[] args) throws InterruptedException {

		Runnable obj1 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello :"+Thread.currentThread().getPriority());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		//////////////////////////////////////////////////////

		Runnable obj2 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi :" + Thread.currentThread().getPriority());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		

		Thread t1 = new Thread(obj1,"Hi Thread");
		Thread t2 = new Thread(obj2,"Hello Thread");
		
		//t1.setName("HiThread");  // important to set name for thread for later use
		//t2.setName("helloThread");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		//System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		t2.start();
		
		System.out.println(t1.isAlive());// it detects if thread is alive
		
		t1.join();//it will wait for t1 to join
		t2.join();//similar with t2
		
		System.out.println("bye");

	}

}