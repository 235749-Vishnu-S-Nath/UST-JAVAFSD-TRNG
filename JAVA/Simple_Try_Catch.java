package ExceptionDay4;

public class Simple_Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int div = 5/0;
			System.out.println("Rest of code in try bloac");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException => "+e.getMessage());
		}
	}

}
