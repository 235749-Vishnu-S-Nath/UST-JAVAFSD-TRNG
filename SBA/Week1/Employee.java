package com.sba;

public class Employee {
	int empID=235;
	String empName="Vishnu";
	float salary=23000.00f;
	int age=21;
	String dept="Development";
	void salary() {
		System.out.println("Salary: "+salary);
	}
	void salary(int a) {				// Overloading
		if(age>50)
			System.out.println("Eligible for bonus");
		else
			System.out.println("Not Eligible for bonus");
	}
}

class Engineer extends Employee{
	void salary() {						// Overriding
		System.out.println("Name: "+empName);
		super.salary();					//Super class calling
	}
	public static void main(String arg[]) {
		Engineer e = new Engineer();
		e.salary();
		Employee em = new Employee();
		System.out.println("Age: "+em.age);
		e.salary(e.age);
	}
}
