package com.doing.more.java;

public class SillyThread extends Thread{
	public void run(){
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread id: " +Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(5000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
    	for (int threadCnt = 0; threadCnt < 5; threadCnt++) {
       		 SillyThread aSillyThread =  new SillyThread();
       		 aSillyThread.start();
    	}
	}
}