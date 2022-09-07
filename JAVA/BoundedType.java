package Generic;

class GenericsClass1<T extends Number>{
	public void display() {
		System.out.println("This is a BoundedType generic Class");
	}
}

public class BoundedType {
	public static void main(String args[]) {
		GenericsClass1<Integer> obj = new GenericsClass1<>();
		obj.display();
	//	GenericsClass1<String> obj1 = new GenericsClass1<>();	// only number can be used
	}
}
