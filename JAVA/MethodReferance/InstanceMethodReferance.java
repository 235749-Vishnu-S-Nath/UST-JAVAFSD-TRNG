package com.MethodReferance;

public class InstanceMethodReferance {

	public void printMsg() {
		System.out.println("Hello, this is instance method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2 = new Thread(new InstanceMethodReferance()::printMsg);
		t2.start();
	}

}
