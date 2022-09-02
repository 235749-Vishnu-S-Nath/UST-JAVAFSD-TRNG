package com.day2;

public class SumOfArray {
	public static void main(String arg[]) {
		int[] numbers= {3,4,5,-5,0,12};
		int sum=0;
		
		for(int num:numbers) {
			sum+=num;
		}
		System.out.println(sum);
	}
}
