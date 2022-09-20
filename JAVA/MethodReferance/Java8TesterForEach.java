package com.MethodReferance;

import java.util.ArrayList;
import java.util.List;

public class Java8TesterForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List name = new ArrayList();
		name.add("Mahesh");
		name.add("Suresh");
		name.add("Ramesh");
		name.add("Naresh");
		name.add("Kalpesh");
		
		name.forEach(System.out::println);
	}

}
