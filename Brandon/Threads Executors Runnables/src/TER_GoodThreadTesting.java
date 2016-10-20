import java.util.Random;

public class TER_GoodThreadTesting{
    public static void main(String[] args){

        Thread1 PrintStuff1 =  new Thread1(); // This creates an instance of the class in question to run.
        Thread2 PrintStuff2 =  new Thread2(); // WhatToDo NameIt = new WhatToDo();
        Thread3 PrintStuff3 =  new Thread3();


        PrintStuff1.start();                  // NameIt.start()
        PrintStuff2.start();
        PrintStuff3.start();
    }
}

class Thread1 extends Thread{               //What to do
    public void run() {                     //Start it
        System.out.println("Thread 1");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}

class Thread3 extends Thread{
    public void run(){
        System.out.println("Thread 3");
    }
}