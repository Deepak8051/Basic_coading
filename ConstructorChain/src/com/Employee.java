package com;

public class Employee {
	Employee(int age){
		this("tom",100);
		System.out.println("age:"+age);

	}
	Employee(String name ,int id){
		
		System.out.println("Id:"+id+" name:"+name);

	}
	Employee(double sal){
		this(25);
		System.out.println("salary:"+sal);

	}
	public static void main(String[] args) {
		new Employee(2.5);
		
		
		
	}

}
