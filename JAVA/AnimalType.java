package SuperThisFinalStatic;

public class AnimalType {
	protected String type="animal";
}

class Dog2 extends AnimalType{
	public String type="mammal";
	
	public void printType() {
		System.out.println("I am a "+type);
		System.out.println("I am an "+super.type);
	}
}

class Main8{
	public static void main(String args[]) {
		Dog2 dog1=new Dog2();
		dog1.printType();
	}
}