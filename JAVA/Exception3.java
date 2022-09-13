package Exceptions;

public class Exception3 {
	public double calc(int a,int b)throws Exception {
		//throw new Exception();
		return a+b;
	}
	void display(int x)throws Exception {
		if(x==5) {
			throw new Exception();
		}
		else
			System.out.println("All okey");
	}
	public static void main(String args[]) {
		Exception3 e = new Exception3();
		
		try {
			e.calc(5,5);
			e.display(4);
		}catch(Exception e1) {
			e1.getStackTrace();
		}
	}
	
}
