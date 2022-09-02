package com.ust;

class Inheritance1 {
	String name="Vishnu";
}

public class Inheritance extends Inheritance1 {
	
	public static void main(String args[]) {
		Inheritance i = new Inheritance();
		System.out.println(i.name);
	}
}