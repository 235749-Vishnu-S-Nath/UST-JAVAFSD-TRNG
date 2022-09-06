package Day3Interface;

interface Language{
	void getName(String name);
}

public class ProgrammingLanguage implements Language{
	public void getName(String name) {
		System.out.println("Programming Language: "+name);
	}
}

class Main4{
	public static void main(String args[]) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");
	}
}