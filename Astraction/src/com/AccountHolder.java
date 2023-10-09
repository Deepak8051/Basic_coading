package com;

public class AccountHolder {

	public static void main(String[] args) {
		//BankImpl b = new BankImpl();
		Bank b = new BankImpl();
		b.checkBalance();
		System.out.println("---------------");
		
		b.deposit(5000);
		b.checkBalance();
		System.out.println("------------");
		
		b.withdraw(3000);
		b.checkBalance();
	
		
		

	}

}
