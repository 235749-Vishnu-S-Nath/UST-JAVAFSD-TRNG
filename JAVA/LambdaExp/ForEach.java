package com.LambdaExp;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String args[]) {
		List<String> l = new ArrayList<String>();
		l.add("Vishnu");
		l.add("Ashiq");
		l.add("Vyshak");
		l.add("Haridev");
		l.forEach(
				(x)->System.out.println(x)
				);
	}
}
