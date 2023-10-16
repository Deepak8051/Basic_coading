package com;

public interface It1 {
	void m1();
	int a=10;
	

}
class test2 implements It1 {
	public void m1() {
		System.out.println("m1-method");
		System.out.println(a);
	}
	class Test3{
	public static void main(String[]args) {
		System.out.println(a);
		test2 t = new test2();
		t.m1();
		
		
	}
}
}
