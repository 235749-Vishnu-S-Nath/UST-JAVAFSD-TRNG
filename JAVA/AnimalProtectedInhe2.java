package com.PolyInheritAbstract;

public class AnimalProtectedInhe2 {
	protected String name;
	
	protected void display() {
		System.out.println("I am an animal 12.");
	}
}

class Dog3 extends AnimalProtectedInhe2{
	public void getInfo() {
		System.out.println("My name is "+name);
	}
}

class Main5{
	public static void main(String args[]) {
		Dog3 lab=new Dog3();
		lab.name="Rocky";
		lab.display();
		lab.getInfo();
	}
}