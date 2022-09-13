package com.Thread;

public class ThreadDemo implements Runnable{

	Thread t;
	ThreadDemo(String str){
		t=new Thread(this,str);
		t.start();
	}
	public void run() {
		for(int i=0;i<5;i++) {
			if((i%5)==0) {
				System.out.println(Thread.currentThread().getName()+" yielding control...");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+" has finished executing.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemo("thread 1");
		new ThreadDemo("thread 2");
		new ThreadDemo("thread 3");
	}

}
