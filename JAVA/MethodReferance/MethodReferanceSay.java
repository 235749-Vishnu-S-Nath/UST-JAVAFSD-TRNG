package com.MethodReferance;

interface Sayable{
	void say();
}

public class MethodReferanceSay {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable say1 = MethodReferanceSay::saySomething;
		say1.say();
	}

}
