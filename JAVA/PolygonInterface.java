package Day3Interface;

interface Polygon{
	void getArea();
	default void getSide() {
		System.out.println("I Can get side of a polygon");
	}
}

class Rectangle implements Polygon{
	public void getArea() {
		int length=6;
		int breadth=5;
		System.out.println("The area of the rectangle is "+(length*breadth));
	}
	
	public void getSide() {
		System.out.println("I have 4 side");
	}
}

class Square implements Polygon{
	public void getArea() {
		int length =5;
		System.out.println("The area of the square is "+(length*length));
	}
}

public class PolygonInterface {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		r1.getArea();
		r1.getSide();
		
		Square s1=new Square();
		s1.getArea();
		s1.getSide();
	}
}
