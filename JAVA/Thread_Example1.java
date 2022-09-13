package com.Thread;

public class Thread_Example1 implements Runnable {

	public void run() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		
		try {
			t1.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		t1.setPriority(7);
		int pr = t1.getPriority();
		System.out.println(pr);
		t1.start();
		System.out.println("Thread running");
	}

}
