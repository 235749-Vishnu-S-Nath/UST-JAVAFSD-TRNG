package com.Optional;

import java.util.Optional;

public class OptionalClassExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> str = Optional.of("one");
		System.out.println(str.orElse("defaultvalue"));
		Optional<String> str1 = Optional.empty();
		System.out.println(str1.orElse("defaultvalue"));
	}

}
