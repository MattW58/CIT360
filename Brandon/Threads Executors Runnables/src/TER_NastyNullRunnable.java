/*
import java.util.Random;


public class TER_NastyNullRunnable {
    public static void main(String[] args) {
        Runnable NastyDice = new NastyDice();

        Thread thread0 = new Thread(NastyDice);
        //NASTY PATH
        Thread thread3 = new Thread(null);

        //Start the arrays.
        thread0.start();
        thread3.start();
    }
}

class NastyDice implements Runnable {
    Random dice = new Random();

    @Override
    public void run() {
        int roll = dice.nextInt(6) + 1;
        System.out.println("Dice on " + Thread.currentThread() + " = " + roll);
    }
}
*/