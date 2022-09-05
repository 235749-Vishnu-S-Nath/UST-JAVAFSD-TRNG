package com.String;

public class stringIndexOf {

	public static void main(String[] args) {
		String str1="Learn Java";
		int result;
		
		result = str1.indexOf('J');
		System.out.println(result);
		
		result = str1.indexOf('a');
		System.out.println(result);
		
		result = str1.indexOf('j');
		System.out.println(result);
		
		result = str1.indexOf("ava");
		System.out.println(result);
		
		result = str1.indexOf("java");
		System.out.println(result);
		
		result = str1.indexOf(result);
		System.out.println(result);
		
		result = str1.indexOf("");
		System.out.println(result);
	}

}
