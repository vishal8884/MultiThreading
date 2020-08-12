
public class PracticeClass {

	public static void main(String[] args) {

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
	}

}
