package Day5;

import java.util.ArrayList;

public class stringArrayList {
	public static void main(String arg[]) {
		ArrayList<String> lang = new ArrayList<>();
		lang.add("Java");
		lang.add("Kotlin");
		lang.add("C++");
		System.out.println("ArrayList: "+lang);
		
		lang.set(2,"JavaScript");
		System.out.println("Modified ArrayList: "+lang);
	}
}
