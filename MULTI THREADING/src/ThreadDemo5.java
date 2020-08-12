
public class ThreadDemo5 {

	public static void main(String[] args) throws InterruptedException {

		Runnable obj1 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
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
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

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