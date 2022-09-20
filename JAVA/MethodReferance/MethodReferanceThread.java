package com.MethodReferance;

public class MethodReferanceThread {

	public static void ThreadStatus() {
		System.out.println("thread running...........");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2 = new Thread(MethodReferanceThread::ThreadStatus);
		t2.start();
	}

}
