import java.util.Random;
public class TER_NastyDuplicateThread {

	public static void main(String[] args) {
		Runnable wellWisher = new goodLuck();
		Runnable throwDice = new diceChucker();
		
		Thread thread1 = new Thread(wellWisher);
		Thread thread2 = new Thread(throwDice);
		
		thread1.start();
		// Roll 5 Dice. This fails because you cannot run the same thread simultaneously. 
		thread2.start();
		thread2.start();
		thread2.start();
		thread2.start();
		thread2.start();
	}
}

class goodLuck implements Runnable{
	@Override
	public void run() {
		System.out.println("Good Luck!");
	}
}

class diceChucker implements Runnable{
	Random dice = new Random();

	@Override
	public void run() {
		int roll = dice.nextInt(6) + 1;
		System.out.println("Dice = " + roll);
	}
}