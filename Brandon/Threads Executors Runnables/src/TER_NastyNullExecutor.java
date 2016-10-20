import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TER_NastyNullExecutor {
    public static void main(String[] args) {

        //The Thread Pool. You only need one, but multiple can be created.
        Executor NastyExecutor = Executors.newCachedThreadPool();
        Executor NastyExecutor2 = Executors.newCachedThreadPool();

        //Create instances of a class to do something
        DiceRollEx ThrowDiceNasty = new DiceRollEx();
        PrintLnEx  GoodLuckNasty = new PrintLnEx();
        SysCheck   PropulsionNasty = new SysCheck();

        //Begin the thread
        NastyExecutor.execute(ThrowDiceNasty);
        NastyExecutor.execute(ThrowDiceNasty);
        NastyExecutor.execute(ThrowDiceNasty);
        NastyExecutor.execute(GoodLuckNasty);
        NastyExecutor.execute(GoodLuckNasty);
        NastyExecutor2.execute(PropulsionNasty);
        NastyExecutor2.execute(null);

    }
}

class DiceRollNasty implements Runnable {
    Random dice = new Random();

    @Override
    public void run() {
        int roll = dice.nextInt(6) + 1;
        System.out.println("Dice on " + Thread.currentThread() + " = " + roll);
    }
}

class PrintLnNasty implements Runnable {

    @Override
    public void run(){
        System.out.println("May the Force be with you.");
    }
}

class SysCheckNasty implements Runnable{

    @Override
    public void run(){
        System.out.println("Checking ship systems");
    }
}