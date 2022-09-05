package SuperThisFinalStatic;

public class This_construct {
	int val1;
	int val2;
	
	This_construct(){
		this(10,20);
		System.out.println("Default construct\n");
	}
	
	This_construct(int val1,int val2){
		this.val1=val1;
		this.val2=val2;
		System.out.println("Parameterized constructor");
	}
}
class Main4{
	public static void main(String args[]) {
		This_construct obj = new This_construct();
	}
}