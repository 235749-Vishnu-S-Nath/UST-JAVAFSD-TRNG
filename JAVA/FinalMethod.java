package SuperThisFinalStatic;

public class FinalMethod {
	public final void display() {
		System.out.println("This is a final method");
	}
}

class Main11 extends FinalMethod{
	public final void display() {		// cannot override
		System.out.println("This final method is overriden");
	}
	
	public static void main(String args[]) {
		Main11 obj = new Main11();
		obj.display();
	}

}