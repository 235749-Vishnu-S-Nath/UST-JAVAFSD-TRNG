package com.Optional;

import java.util.Optional;

public class OptionalGetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> o = Optional.of("Hello");
		if(o.isPresent()) {
			String value = o.get();
			System.out.println("Optional value: "+value);
		}
		else {
			System.out.println("Optional has no value");
		}
	}
}