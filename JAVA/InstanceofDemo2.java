package com.day2Set2;

class A{}

class B extends A{}

public class InstanceofDemo2 {
	public static void main(String args[]) {
		B objOfClassB = new B();
		System.out.println("objOfClassB is an instance of B: "+ (objOfClassB instanceof B));
		System.out.println("objOfClassB is an instance of parent class A: "+ (objOfClassB instanceof A));
	}
}
