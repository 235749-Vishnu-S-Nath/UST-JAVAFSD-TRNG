package ExceptionDay4;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int div = 5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException => "+e.getMessage());
		}
		finally {
			System.out.println("This is the Finally block");
		}
	}

}
