package SuperThisFinalStatic;

public class AnimalCnstrParamater {
	AnimalCnstrParamater(){
		System.out.println("Iam an animal");
	}
	AnimalCnstrParamater(String type){
		System.out.println("Type: "+type);
	}
}

class Dog4 extends AnimalCnstrParamater{
	Dog4(){
		super("Animal");
		System.out.println("Iam a dog");
	}
}

class Main10{
	public static void main(String args[]) {
		Dog4 dog1 = new Dog4();
	}
}