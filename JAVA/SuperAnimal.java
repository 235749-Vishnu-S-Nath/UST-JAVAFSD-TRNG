package SuperThisFinalStatic;

public class SuperAnimal {
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog1 extends SuperAnimal{
	
	public void display() {
		System.out.println("Iam a dog");
	}
	public void printMessage() {
		display();
		super.display();
	}
}

class Main7{
	public static void main(String args[]) {
		Dog1 dog1 = new Dog1();
		dog1.printMessage();
	}
}