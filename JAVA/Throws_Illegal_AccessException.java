package ExceptionDay4;

public class Throws_Illegal_AccessException {

	static void fun() throws IllegalAccessException{
		System.out.println("Inside fun().");
		throw new IllegalAccessException("demo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fun();
		}
		catch(IllegalAccessException e) {
			System.out.println("caught in main.");
		}
	}

}
