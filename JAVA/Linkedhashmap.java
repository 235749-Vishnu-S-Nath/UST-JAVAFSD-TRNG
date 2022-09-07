package Day5;

import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> evenNumber = new LinkedHashMap<>();
		
		evenNumber.put("Two", 2);
		evenNumber.put("Four", 4);
		System.out.println("LinkedHashMap1: "+evenNumber);
		
		LinkedHashMap<String,Integer> num = new LinkedHashMap<>(evenNumber);
		num.put("Three", 3);
		System.out.println("LinkedHashMap2: "+num);
	}
}