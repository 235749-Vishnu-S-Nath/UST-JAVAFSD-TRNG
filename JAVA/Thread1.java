package com.Thread;

public class Thread1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t = new Thread1();
		t.start();
	}
	
	public void run() {
		System.out.println("In run");
	}
}
