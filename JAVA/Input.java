package com.ust;
import java.util.Scanner;

public class Input {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Float: ");
		float myFloat = input.nextFloat();
		System.out.println("Float Entered: " + myFloat);
		
		System.out.println("Enter Double: ");
		double myDouble = input.nextDouble();
		System.out.println("Double Entered: " + myDouble);
		
		System.out.println("Enter Text: ");
		String myString = input.next();
		System.out.println("String Entered: " + myString);
	}
}
