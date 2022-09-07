package com.sba;

interface Employee2{
	void calculateSalary(double sal);
	void fetchDepartment();
}

class Engineer2 implements Employee2{
	double sty=1000.0;
	public void calculateSalary(double sal) {
		System.out.println("Salary: "+(sal+sty));
	}
	public void fetchDepartment(){
		System.out.println("Engineer");
	}
}

class Doctor1 implements Employee2{
	double sty=5000.0;
	public void calculateSalary(double sal) {
		System.out.println("Salary: "+(sal+sty));
	}
	public void fetchDepartment(){
		System.out.println("Doctor");
	}
}

public class Sba2Q2 {
	public static void main(String args[]) {
		Engineer2 e = new Engineer2();
		Doctor1 d = new Doctor1();
		e.fetchDepartment();
		e.calculateSalary(23000.0);
		d.fetchDepartment();
		d.calculateSalary(40000.0);
	}
}