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
	void salary(int a) {
		if(age>50)
			System.out.println("Eligible for bonus");
		else
			System.out.println("Not Eligible for bonus");
	}
}

class Engineer extends Employee{
	void salary() {
		System.out.println("Name: "+empName);
	}
	public static void main(String arg[]) {
		Engineer e = new Engineer();
		e.salary();
		e.salary(e.age);
		Employee em = new Employee();
		em.salary();
	}
}