package com.PredicateCollectorStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1{
	int id;
	String name;
	float price;
	public Product1(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class JavaStreamExample2 {

	public static void main(String[] args) {
		List<Product1> proList = new ArrayList<>();
		proList.add(new Product1(1,"HP Laptop",25000f));
		proList.add(new Product1(2,"Dell Laptop",30000f));
		proList.add(new Product1(3,"Lenevo Laptop",28000f));
		proList.add(new Product1(4,"Sony Laptop",28000f));
		proList.add(new Product1(5,"Apple Laptop",90000f));
		Float totalPrice =  proList.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum+price);
		System.out.println(totalPrice);
		
		float totalPrice2 = proList.stream().map(pro->pro.price).reduce(0.0f, Float::sum);
		System.out.println(totalPrice2);
	}
}