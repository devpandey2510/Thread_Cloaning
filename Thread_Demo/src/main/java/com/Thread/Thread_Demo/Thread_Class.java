package com.Thread.Thread_Demo;

class MyThread extends Thread{
	
	String [] message = {"I" , "Love" , "Money" , "Very" ," much" };
	
	public MyThread(String str) {
		super(str);
	}
	
	public void run() {
		ExecuteThread.runthread(getName(), message);
	}
	
}

class ExecuteThread{
	public static synchronized void runthread(String name, String [] msg) {
		for(int i=0;i<msg.length;i++) {
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
			System.out.println(name + " " + msg[i]);
		}
	}
}

public class Thread_Class {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Thread 1:");
		MyThread t2 = new MyThread("Thread 2:");
		MyThread t3 = new MyThread("Thread 3:");
		MyThread t4 = new MyThread("Thread 4:");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
