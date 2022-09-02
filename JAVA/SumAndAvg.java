package com.day2Set2;

public class SumAndAvg {
	public static void main(String args[]) {
		int num[]= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double avg;
		
		for(int n:num) {
			sum=n+sum;
		}
		
		int arrayLength = num.length;
		avg=((double)sum/(double)arrayLength);
		
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
	}
}
