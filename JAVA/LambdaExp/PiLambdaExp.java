package com.LambdaExp;

@FunctionalInterface
interface MyInterface{
	double getPiValue();
}

public class PiLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface ref;
		ref = ()->3.1415;
		System.out.println("Value of Pi= "+ref.getPiValue());
	}

}
