package com.Optional;

import java.util.Optional;

public class OptionalClassExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> emptyOption = Optional.empty();
		Optional<String> strOption = Optional.of("one");
		System.out.println(emptyOption.orElseGet(()->"Optional null orElseGet"));
		System.out.println(strOption.orElseGet(()->"Optional value orElseGet"));
	}

}
