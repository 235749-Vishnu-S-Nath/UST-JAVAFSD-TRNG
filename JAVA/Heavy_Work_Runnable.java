package com.Thread;

public class Heavy_Work_Runnable implements Runnable {
	
	public void run() {
		System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing -END "+Thread.currentThread().getName());
	}
	
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heavy_Work_Runnable r = new Heavy_Work_Runnable();
		r.run();
	}

}
