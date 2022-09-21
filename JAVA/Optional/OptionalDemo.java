package com.Optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word[] = new String[10];
		Optional<String> checkNull = Optional.ofNullable(word[5]);
		if(checkNull.isPresent()) {
			String w = word[5].toLowerCase();
			System.out.println(w);
		}
		else
			System.out.println("Word is null");
	}

}
