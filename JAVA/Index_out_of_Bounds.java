package ExceptionDay4;

public class Index_out_of_Bounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int array[] = new int[10];
			array[10]=30/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
