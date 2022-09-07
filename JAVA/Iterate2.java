package Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(3);
		num.add(2);
		System.out.println("ArrayList: "+num);
		
		Iterator<Integer> iterate = num.iterator();
		int number = iterate.next();
		System.out.println("Accessed Element: "+number);
		iterate.remove();
		System.out.println("Removed element: "+number);
		
		System.out.println("Updated: ");
		while(iterate.hasNext()) {
			iterate.forEachRemaining((value)->System.out.println(value+","));
		}
	}

}
