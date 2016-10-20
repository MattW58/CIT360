import java.util.Random;

public class TER_GoodRunnable {
	public static void main(String[] args) {
//make runnable | Name it  = give runnable a class (or job) to do
		Runnable throwDice = new DiceRoll(); //Runnable NAME = new CLASSTOEXECUTE();
		Runnable wellWisher = new GoodLuck();

		//Create threads for it
// make thread|name it = give the thread a runnable
		Thread thread0 = new Thread(throwDice); // Thread THREADNAME = new Thread(RUNNABLENAME);
		Thread thread1 = new Thread(throwDice);
		Thread thread2 = new Thread(throwDice);
		Thread thread3 = new Thread(wellWisher); // This is the separate one.

		//Start each thread individually
		thread0.start();
		thread1.start();
		thread2.start();
		thread3.start();
		
		// you can put all this in one line if you want. (Courtesy of RJ)
		//new Thread(new DiceRoll()).start();
	}
}

// THIS IS WHAT EVERY NEW RUNNABLE THREAD WILL DO. 
class DiceRoll implements Runnable {
	Random dice = new Random();

	@Override
	public void run() {
		int roll = dice.nextInt(6) + 1;
		System.out.println("Dice on " + Thread.currentThread() + " = " + roll);
	}
}

class GoodLuck implements Runnable{

	@Override
	public void run() {
		System.out.println("May the Fourth be with you.");
	}
}