import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TER_GoodExecutor {
	public static void main(String[] args) {

		//The Thread Pool. You only need one, but multiple can be created.
		Executor anExecutor = Executors.newCachedThreadPool();
		Executor anExecutor2 = Executors.newCachedThreadPool();

		//Create instances of a class to do something
		DiceRollEx ThrowDice = new DiceRollEx();
		PrintLnEx  GoodLuck = new PrintLnEx();
		SysCheck   Propulsion = new SysCheck();
		
		//Begin the thread
		anExecutor.execute(ThrowDice);
		anExecutor.execute(ThrowDice);
		anExecutor.execute(ThrowDice);
		anExecutor.execute(GoodLuck);
		anExecutor.execute(GoodLuck);
		anExecutor2.execute(Propulsion);

	}
}

class DiceRollEx implements Runnable {
	Random dice = new Random();

	@Override
	public void run() {
		int roll = dice.nextInt(6) + 1;
		System.out.println("Dice on " + Thread.currentThread() + " = " + roll);
	}
}

class PrintLnEx implements Runnable {

	@Override
	public void run(){
		System.out.println("May the Force be with you.");
	}
}

class SysCheck implements Runnable{

	@Override
	public void run(){
		System.out.println("Checking ship systems");
	}
}