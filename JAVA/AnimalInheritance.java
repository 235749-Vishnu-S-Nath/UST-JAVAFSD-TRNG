package com.PolyInheritAbstract;

public class AnimalInheritance {
	public void displayInfo() {
		System.out.println("Iam an animal.");
	}
}

class Dog extends AnimalInheritance{
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Iam a Dog");
	}
}

class Main1{
	public static void main(String args[]) {
		Dog d1=new Dog();
		d1.displayInfo();
	}
}