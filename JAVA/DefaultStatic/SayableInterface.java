package com.DefaultStatic;

interface Sayable{
	default void say() {
		System.out.println("Hello, this is default method");
	}
	void sayMore(String msg);
}

public class SayableInterface implements Sayable{

	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayableInterface dm = new SayableInterface();
		dm.say();
		dm.sayMore("Work is worship");
	}

}
