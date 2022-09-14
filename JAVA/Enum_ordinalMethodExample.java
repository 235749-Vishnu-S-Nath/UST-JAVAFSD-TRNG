package Enums;

public class Enum_ordinalMethodExample {

	enum Position{
		Reema("Panda"),Himanshu("Bhardwaj"),Geetanjali("Sharma");
		String IName;
		Position(String s){
			IName=s;
		}
		String showPosition() {
			return IName;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Position pos:Position.values()) {
			int val = pos.ordinal()+1;
			System.out.println("\nFirst name: "+pos+"\nLast name: "+pos.showPosition()+"\nPosition in class: "+val+"\n");
		}
	}

}
