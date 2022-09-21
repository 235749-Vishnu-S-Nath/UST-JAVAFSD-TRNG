package com.DefaultStatic;

interface Sayable1{
	default void say() {
		System.out.println("default method");
	}
	void sayMore(String msg);
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class SayableCallingStaticMethod implements Sayable1{

	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayableCallingStaticMethod dm = new SayableCallingStaticMethod();
		dm.say();
		dm.sayMore("Work is workship");
		Sayable1.sayLouder("Helloooo.............");
	}

}
