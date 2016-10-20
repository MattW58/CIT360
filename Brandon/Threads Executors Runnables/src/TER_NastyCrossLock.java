public class TER_NastyCrossLock extends Thread{
    Object bob;
    Object kate;

    public TER_NastyCrossLock(Object name1, Object name2){
        bob = name1;
        kate = name2;
    }

    public void run(){
        synchronized (bob){
            try{
                Thread.sleep(1000);
                System.out.println("Hi there Kate, wazzup?");
                synchronized (kate){
                    System.out.println("I am good, thanks Bob.");
                }
            }
            catch (Exception STOP){
                STOP.printStackTrace();
            }
        }
    }
}

class TER_NastyCrossLock2 extends Thread{
    Object bob;
    Object kate;

    public TER_NastyCrossLock2(Object name1, Object name2){
        bob = name1;
        kate = name2;
    }

    public void run(){
        synchronized (kate){
            try{
                Thread.sleep(1000);
                System.out.println("Hi there Bob, wazzup?");
                synchronized (bob){
                    System.out.println("I am good, thanks Kate.");
                }
            }
            catch (Exception STOP){
                STOP.printStackTrace();
            }
        }
    }
}