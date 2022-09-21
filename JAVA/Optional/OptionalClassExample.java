package com.Optional;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Object> objOptional = Optional.ofNullable(null);
		System.out.println(objOptional.isPresent());
		Optional<String> strOptional = Optional.ofNullable("one");
		System.out.println(strOptional.isPresent());
	}

}
