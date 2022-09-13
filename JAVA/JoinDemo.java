package com.Thread;

public class JoinDemo implements Runnable{

	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: "+t.getName());
		System.out.println("Is Alive? "+t.isAlive());
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread t = new Thread(new JoinDemo());
		t.start();
		t.join(1000);
		System.out.println("join after 1 sec");
		System.out.println("Current thread: "+t.getName());
		System.out.println("Is alive? "+t.isAlive());
	}

}
