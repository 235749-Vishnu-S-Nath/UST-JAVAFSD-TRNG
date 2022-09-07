package Day5;

import java.util.Iterator;
import java.util.TreeSet;

public class Iterator1 {
	public static void main(String args[]) {
		TreeSet<Integer> num = new TreeSet<>();
		num.add(2);
		num.add(5);
		num.add(6);
		System.out.println("TreeSet: "+num);
		
		Iterator<Integer> iterate = num.iterator();
		System.out.println("TreeSet using Iterator: ");
		while(iterate.hasNext()) {
			System.out.print(iterate.next()+",");
		}
	}
}
