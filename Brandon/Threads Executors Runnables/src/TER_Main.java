import java.util.Arrays;

public class TER_Main {

    public static void main(String[] args){
        /*
        Object Person1 = new Object();
        Object Person2 = new Object();

        Thread Lock1 = new Thread(new TER_NastyCrossLock(Person1, Person2));
        Thread Lock2 = new Thread(new TER_NastyCrossLock2(Person1, Person2));

        Lock1.start();
        Lock2.start();
        */

        int[] RaceTrack = new int[100];
        Arrays.fill(RaceTrack,0);

        Thread Horse1 = new Thread(new TER_NastyRace(RaceTrack));
        Thread Horse2 = new Thread(new TER_NastyRace2(RaceTrack));

        Horse1.start();
        Horse2.start();
    }
}