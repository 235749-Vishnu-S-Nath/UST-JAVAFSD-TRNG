package com.Thread;

public class Thread3 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t= new Thread3();
		try {
			System.out.println("Hi");
			t.sleep(1000);
			System.out.println("Guys");
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
