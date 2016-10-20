public class TextbookRunnableA {
	public static void main(String[] args) {
		// Create tasks
		Runnable printA = new TextbookRunnableA3('a', 100);
		Runnable printB = new TextbookRunnableA3('b', 100);
		Runnable print100 = new TextbookRunnableA2(100);
		
		//Create threads
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		//Start threads
		thread1.start();
		thread2.start();
		thread3.start();
		
//		(new Thread(new TextbookRunnableA3('c', 20))).start();
//		(new Thread(new RunnableATask1('D', 20))).start();
	}
}