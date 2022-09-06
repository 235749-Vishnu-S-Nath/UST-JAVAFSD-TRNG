package Day3Interface;

public class AutoBoxing {
	public static void main(String args[]) {
		Integer i = new Integer(10);	//boxing
		int i1=i;						//unboxing
		
		System.out.println("Value of i: "+i);
		System.out.println("Value of i1: "+i1);
		
		Character X='a';	//Autoboxing of character
		char ch=X;			//Auto-unboxing of character
		
		System.out.println("Value ch: "+ch);
		System.out.println("value X: "+X);
	}
}
