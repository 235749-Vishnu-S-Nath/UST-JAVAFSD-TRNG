package com.sba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sba2Q3 {
	public static void main(String arg[]) {
		List<Integer> eid = new ArrayList<>();
		for(int i=1000;i<=1020;i++) {
			eid.add(i);
		}
		System.out.println("Employee IDs: ");
		Iterator itr = eid.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}
}
