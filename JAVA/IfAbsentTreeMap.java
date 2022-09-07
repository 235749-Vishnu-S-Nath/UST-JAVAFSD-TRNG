package Day5;

import java.util.TreeMap;

public class IfAbsentTreeMap {

	public static void main(String[] args) {
		TreeMap<String,Integer> evenNum = new TreeMap<>();
		
		evenNum.put("Two", 2);
		evenNum.put("Four", 4);
		
		evenNum.putIfAbsent("Six", 6);
		System.out.println("TreeMap of even number: "+evenNum);
		
		TreeMap<String,Integer> num = new TreeMap<>();
		num.put("One", 1);
		num.putAll(evenNum);
		System.out.println("TreeMap of Numbers: "+ num);
	}

}
