package com.DefaultStatic;

public class VehicleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Car();
		v.print();
	}
}

interface Vehicle{
	default void print() {
		System.out.println("Iam a Vehicle");
	}
	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}

interface FourWheeler{
	default void print() {
		System.out.println("Iam a four Wheeler!");
	}
}

class Car implements Vehicle,FourWheeler{
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("Iam a car!");
	}
}