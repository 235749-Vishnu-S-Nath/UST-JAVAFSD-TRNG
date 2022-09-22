package com.PredicateCollectorStream;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> checkOddEven = x->x%2==0;
		System.out.println("14: "+checkOddEven.test(14));
		System.out.println("18: "+checkOddEven.test(18));
		System.out.println("21: "+checkOddEven.test(21));
	}

}
