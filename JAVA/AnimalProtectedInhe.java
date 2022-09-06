package com.PolyInheritAbstract;

public class AnimalProtectedInhe {
	protected void displayInfo() {
		System.out.println("I am an animal.");
	}
}

class Dog1 extends AnimalProtectedInhe{
	public void displayInfo() {
		System.out.println("Ima a dog.");
	}
}

class Main3{
	public static void main(String args[]) {
		Dog1 d1=new Dog1();
		d1.displayInfo();
	}
}