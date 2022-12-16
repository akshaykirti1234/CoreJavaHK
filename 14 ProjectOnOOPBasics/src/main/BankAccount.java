//Bank account.java

package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class BankAccount {
	private static String bankName;
	private static String branchName;
	private static String ifsc;
	
	private String accNum;
	private String accHName;
	private double balance;
	
	static {
		System.out.println("\nBankAccount class is loaded");
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
		System.out.println("SV memory alocated with default values");
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
		System.out.println("Reading static variable's values from file and initializiing them");
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
	}
}
