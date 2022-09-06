package com.PolyInheritAbstract;

public class AnimalInhOverride {
	public void eat() {
		System.out.println("I can eat");
	}
}

class Dog2 extends AnimalInhOverride{
	public void eat() {
		super.eat();
		System.out.println("I eat dog food");
	}
	
	public void bark() {
		System.out.println("I can bark");
	}
}

class Main4{
	public static void main(String args[]) {
		Dog2 labrador = new Dog2();
		labrador.eat();
		labrador.bark();
	}
}