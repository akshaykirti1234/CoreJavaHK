package com.nit.hk.p1;

public class BankAccount {
	private double balance;
	
	//setter method
	public void setBalance(double balance) throws IllegalArgumentException {
		if(balance == 0) {
			throw new IllegalArgumentException("Don't pass Zero");
		}
		
		if(balance < 0) {
			throw new IllegalArgumentException("Don't pass negetive values");
		}
		this.balance = balance;
	}
	
	//getter method
	public double getBalance() {
		return balance;
	}
}
