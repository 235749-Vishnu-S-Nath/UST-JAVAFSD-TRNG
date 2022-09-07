package Day5;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		Map<String,Integer> value = new TreeMap<>();
		
		value.put("Second", 2);
		value.put("First", 1);
		System.out.println("Map using TreeMap: "+value);
		
		value.replace("First", 11);
		value.replace("Second", 22);
		
		int removedValue= value.remove("First");
		System.out.println("Removed Value: "+removedValue);
	}

}