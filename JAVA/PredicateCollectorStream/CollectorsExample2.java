package com.PredicateCollectorStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class CollectorsExample2 {

	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		stList.add(new Student(11,"Jon",22));
		stList.add(new Student(22,"Steve",18));
		stList.add(new Student(33,"Lucy",22));
		stList.add(new Student(44,"Sansa",23));
		stList.add(new Student(55,"Maggie",18));
		List<String> names = stList.stream().map(n->n.name).collect(Collectors.toList());
		System.out.println(names);
	}

}
