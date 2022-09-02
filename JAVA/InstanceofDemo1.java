package com.day2Set2;

class Fruit1{}
class Vehicle1{}

public class InstanceofDemo1 {
	public static void main(String args[]) {
		Fruit1 apple = new Fruit1();
		Vehicle1 car = new Vehicle1();
		System.out.println("car IS A Fruit: "+(apple instanceof Fruit1));	//Error Statment
	}
}
