package SuperThisFinalStatic;

public class AnimalCnstr {
	AnimalCnstr(){
		System.out.println("Iam an animal");
	}
}

class Dog3 extends AnimalCnstr{
	Dog3() {
		super();	//call default constructor of super class
		System.out.println("Iam a dog");
	}
}

class Main9{
	public static void main(String args[]) {
		Dog3 dog1=new Dog3();
	}
}