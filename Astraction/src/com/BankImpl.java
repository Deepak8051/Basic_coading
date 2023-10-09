package com;

class BankImpl  implements Bank{
	int balance = 5000;
	@Override
	public void deposit(int amount) {
		System.out.println("Deposit rs."+amount);
		balance = balance+amount;
		System.out.println("amount deposit sucessfully");

	}
	@Override
	public void withdraw(int amount) {
		if(amount <=balance) { 
		System.out.println("withdrwa amount "+amount);
		balance = balance-amount;///balance - = amount;
		System.out.println("Amount withdraw sucessfully");
	}
	else {
		System.out.println("Insufficent Balance");
	}
}
	@Override
	public void checkBalance() {
		System.out.println("check bilance"+balance);
	}



}
