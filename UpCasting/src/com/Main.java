package com;

public class Main {

	public static void main(String[] args) {

		//upcasting
		Father i=new Son();
		System.out.println(i.name);
		//Downcasting

		Son s = (Son) i;

		System.out.println(i.name+ " "+s.age);

	}

}
