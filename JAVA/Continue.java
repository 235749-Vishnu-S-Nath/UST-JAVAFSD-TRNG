package com.day2;

public class Continue {
	public static void main(String[] arg) {
		for(int i=0;i<=10;i++) {
			if(i>4 && i<9)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
