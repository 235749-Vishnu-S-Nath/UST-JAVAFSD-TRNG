package com.ust;

class Car{
	String model;
	int wheels;
	String colour;
	int seat;
	String gearType;
	
	void display() {
		System.out.println("In Car Class");
	}
}

class Ciaz extends Car {
	void dislpay() {
		System.out.println("In Ciaz Class");
	}
	
	void show() {
		System.out.println("In Show Class");
	}
}

public class Ertiga extends Car {
	
	void dislpay() {
		System.out.println("In Ertiga Class");
		super.display();
	}
	
	public static void main(String arg[]) {
		Ciaz c = new Ciaz();
		c.display();
		c.show();
		Ertiga e = new Ertiga();
		e.dislpay(); System.out.println(e.colour);
	}
}
