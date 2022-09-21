package com.DefaultStatic;

interface TestInterface{
	public void square(int a);
	default void show() {
		System.out.println("Default Method Exexcuted");
	}
}

public class SimpleDefaultMethodInterface  implements TestInterface{
	public void square(int a) {
		System.out.println(a*a);
	}
	
	public static void main(String args[]) {
		SimpleDefaultMethodInterface d = new SimpleDefaultMethodInterface();
		d.square(4);
		
		d.show();
	}
}
