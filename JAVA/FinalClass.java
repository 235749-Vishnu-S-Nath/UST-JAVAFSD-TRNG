package SuperThisFinalStatic;

final public class FinalClass {
	public void display() {
		System.out.println("This is a final method");
	}
}

class Main12 extends FinalClass{	// Final class cannot be inherited
	public void display() {
		System.out.println("this is final method overriden");
	}
	public static void main(String args[]) {
		Main12 obj= new Main12();
		obj.display();
	}
}