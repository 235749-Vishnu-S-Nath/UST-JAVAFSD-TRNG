package com.Thread;

public class MyThread extends Thread{

	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("MyThread-START "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread-END "+Thread.currentThread().getName());
	}
	
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread r = new MyThread("hai");
		r.start();
	}

}
