package Day5;

import java.util.ArrayList;
import java.util.List;

public class integerArrayList {
	public static void main(String args[]) {
		List<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		System.out.println("List: "+number);
		
		int num = number.get(2);
		System.out.println("Accessed Element: "+num);
		
		int removed = number.remove(1);
		System.out.println("Removed Element: "+removed);
	}
}