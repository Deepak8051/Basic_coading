package com;

public class Customer implements ATM {
	@Override
	public void deposit() {
		System.out.println("Amout deposit");
	}
	@Override
	public void withdraw() {
		System.out.println("amount withdraw");
	}
	public static void main(String[] args) {
		Customer a = new Customer();
		a.deposit();
		a.withdraw();
	}
	

}
