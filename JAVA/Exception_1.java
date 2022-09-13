package Exceptions;

public class Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		try {
			System.out.println(a[5]);
		}
		catch(Exception e) {
			e.getStackTrace();
			//System.out.println(e);
		}
	}

}
