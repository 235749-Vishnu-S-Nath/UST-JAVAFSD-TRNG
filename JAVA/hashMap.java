package Day5;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
	public static void main(String[] args) {
		Map<String,Integer> num = new HashMap<>();
		
		num.put("One",1);
		num.put("Two",2);
		System.out.println("Map: "+num);
		
		System.out.println("Key: "+num.keySet());
		System.out.println("Value: "+num.values());
		System.out.println("Entries: "+num.entrySet());
		
		int value=num.remove("Two");
		System.out.println("Remove Value: "+value);
	}
}
