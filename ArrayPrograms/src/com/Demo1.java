package com;

public class Demo1 {

	public static void main(String[] args) {
	int [] a= {10,20,30};
	for(int i=0;i<a.length; i++) {
		System.out.println(a[i]);
		
		
	}
	System.out.println("-----");
	    //backword direction
	for(int i=a.length-1; i>=0; i--) {
		System.out.println(a[i]);
		
		
	}
	}

}