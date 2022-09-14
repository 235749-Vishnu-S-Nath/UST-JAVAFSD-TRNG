package Enums;

enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

class Test{
	Size1 pizzaSize;
	public Test(Size1 pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza.");
			break;
		case MEDIUM:
			System.out.println("I Ordered a Medium size pizza.");
			break;
		default:
			System.out.println("I don't know which one to order.");
			break;
		}
	}
}

public class Pizza_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 =  new Test(Size1.MEDIUM);
		t1.orderPizza();
	}

}
