package com.ust;

public class SwitchExample {
	public static void main(String args[]) {
		String str="green";
		switch(str) {
		case "red":System.out.println("Iam in red");
		break;
		case "blue":System.out.println("Iam in blue");
		break;
		case "green":System.out.println("Iam in green");
		break;
		default: System.out.println("reached the default color");
		}
	}
}
