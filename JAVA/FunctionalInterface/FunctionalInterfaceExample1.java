package com.FunctionalInterface;

@FunctionalInterface
interface Sayable{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class FunctionalInterfaceExample1 implements Sayable{

	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceExample1 fie = new FunctionalInterfaceExample1();
		fie.say("HelloThere");
	}
}
