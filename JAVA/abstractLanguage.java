package AbstractInterface;

abstract class abstractLanguage {
	public void display() {
		System.out.println("This is Java Programming");
	}
}

class Main extends abstractLanguage{
	public static void main(String args[]) {
		Main obj = new Main();
		obj.display();
	}
}