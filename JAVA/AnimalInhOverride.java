package com.PolyInheritAbstract;

/**
 * The type Animal inh override.
 */
public class AnimalInhOverride {
	/**
	 * Eat.
	 */
	public void eat() {
		System.out.println("I can eat");
	}
}

/**
 * The type Dog 2.
 */
class Dog2 extends AnimalInhOverride{
	public void eat() {
		super.eat();
		System.out.println("I eat dog food");
	}

	/**
	 * Bark.
	 */
	public void bark() {
		System.out.println("I can bark");
	}
}

/**
 * The type Main 4.
 */
class Main4{
	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(String args[]) {
		Dog2 labrador = new Dog2();
		labrador.eat();
		labrador.bark();
	}
}