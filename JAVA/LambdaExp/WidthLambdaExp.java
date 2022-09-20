package com.LambdaExp;

@FunctionalInterface
interface Drawable{
	public void draw();
}

public class WidthLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		Drawable d2 = ()->{
			System.out.println("Drawing "+width);
		};
		d2.draw();
	}

}
