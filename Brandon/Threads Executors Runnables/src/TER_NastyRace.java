import java.util.Arrays;

public class TER_NastyRace implements Runnable{

    int[] raceTrack;

    public TER_NastyRace(int[] array){
        raceTrack = array;
    }
    public void run(){
        try{
            Arrays.fill(raceTrack,1);
            System.out.println(Arrays.toString(raceTrack));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

class TER_NastyRace2 implements Runnable{

    int[] raceTrack;

    public TER_NastyRace2(int[] array){
        raceTrack = array;
    }
    public void run(){
        try{
            Arrays.fill(raceTrack,2);
            System.out.println(Arrays.toString(raceTrack));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}