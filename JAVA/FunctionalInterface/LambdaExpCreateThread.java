package com.FunctionalInterface;

public class LambdaExpCreateThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(()->{
			System.out.println("New Thread created");
		}).start();
	}

}
