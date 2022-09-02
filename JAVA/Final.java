package com.ust;

public class Final extends Super1 {
	final int x=5;
	int y;
	
/*	void display() {
		System.out.println("In final");
	}
*/
	
	public static void main(String args[]) {
		Final obj = new Final();
		//obj.x=7;
		obj.y=10;
		System.out.println(obj.z);
	//	System.out.println(obj.display());
		obj.display();
	}
}


class Super1{
	final int z=10;
	final void display() {
		System.out.println("In display");
	}
	void display(int x) {
		System.out.println("-*_*-");
	}
}