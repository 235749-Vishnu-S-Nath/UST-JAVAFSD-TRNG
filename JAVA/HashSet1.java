package Day5;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String args[]) {
		HashSet<Integer> evenNum = new HashSet<>();
		evenNum.add(2);
		evenNum.add(4);
		evenNum.add(6);
		System.out.println("HashSet: "+evenNum);
		
		HashSet<Integer> num = new HashSet<>();
		num.addAll(evenNum);
		num.add(5);
		System.out.println("New HashSet: "+num);
	}
}
