import java.util.Random;

public class TER_GoodThread extends Thread{
	public static void main(String[] args){

		TER_GoodThread rollDice0 =  new TER_GoodThread();
		TER_GoodThread rollDice1 =  new TER_GoodThread();
		TER_GoodThread rollDice2 =  new TER_GoodThread();
		
		rollDice0.start();
		rollDice1.start();
		rollDice2.start();
	}

	public void run(){
		Random dice = new Random();
		int roll = dice.nextInt(6) +1;
		System.out.println("Dice on " + Thread.currentThread() + " = " + roll);
	}
}