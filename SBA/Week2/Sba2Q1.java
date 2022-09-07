package com.sba;

abstract class Employee1{
	abstract void calculateSalary(double sal);
	abstract void fetchDepartment();
}

class Engineer1 extends Employee1{
	double sty=1000.0;
	public void calculateSalary(double sal) {
		System.out.println("Salary: "+(sal+sty));
	}
	public void fetchDepartment(){
		System.out.println("Engineer");
	}
}

class Doctor extends Employee1{
	double sty=5000.0;
	public void calculateSalary(double sal) {
		System.out.println("Salary: "+(sal+sty));
	}
	public void fetchDepartment(){
		System.out.println("Doctor");
	}
}

public class Sba2Q1 {
	public static void main(String args[]) {
		Engineer1 e = new Engineer1();
		Doctor d = new Doctor();
		e.fetchDepartment();
		e.calculateSalary(23000.0);
		d.fetchDepartment();
		d.calculateSalary(40000.0);
	}
}
