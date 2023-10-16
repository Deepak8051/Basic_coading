package com;

public class Deepak extends Amazon implements Jspider,Qspider{
	@Override
	public void developer() {
		System.out.println("develop");
	}
	@Override
	public void testApp() {
		System.out.println("test app");
	}
	public static void main(String[] args) {
		Deepak d = new Deepak();
		d.developer();
		d.testApp();
	}
	//Optionally we can override work() from amazon class aw well as
	//bt it is not menditery because work() is already a concrete method
	

}
