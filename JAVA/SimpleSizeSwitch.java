package com.loopsandswitch;

public class SimpleSizeSwitch {

	public static void main(String[] args) {
		int exp=9;
		switch(exp) {
		case 2:
			System.out.println("Small size");
			break;
		case 3:
			System.out.println("Large size");
			break;
		default:
			System.out.println("Unknown");
		}
	}

}
