package com;

public class Main1 {

	public static void main(String[] args) {
		
		//upcasting
	Vechicle v= new Car();
	//System.out.println(v.start);
	
	//downcasting
	Car c= (Car) v;
	System.out.println(c.color);
	System.out.println(v.brand);
	

	}

}
