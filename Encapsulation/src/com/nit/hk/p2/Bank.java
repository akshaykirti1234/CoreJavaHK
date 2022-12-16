package com.nit.hk.p2;

import com.nit.hk.p1.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BankAccount acc1 = new BankAccount();
		
		while(true) {
			try {
				System.out.println("Enter blance");
				double balance = scn.nextDouble();
				
				acc1.setBalance(balance);
				System.out.println("Current balance : "+acc1.getBalance());
				break;
			}catch(InputMismatchException e) {
				System.err.println("Enter only number");
				scn.nextLine();
			}catch(IllegalArgumentException e) {
				System.err.println(e.getMessage());
			}
		} // End of while
	}
}
