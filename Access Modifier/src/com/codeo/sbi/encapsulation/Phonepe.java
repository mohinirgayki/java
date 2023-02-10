package com.codeo.sbi.encapsulation;

import java.util.Scanner;
public class Phonepe {

public static void main(String[] args)
  {
	Scanner scanner = new Scanner(System.in);
	BankDetails accountHolder1 = new BankDetails();
	System.out.println("Enter Account Number:");
	long Accountno = scanner.nextLong();
	System.out.println("Enter you AccountHolderName: ");
	String accountHolderName=scanner.next();

	accountHolder1.setaccountno(Accountno);
	accountHolder1.setpersonname(accountHolderName);
	accountHolder1.setaccountbalance(45367.32);
	System.out.println("Printing Details for Person 1: ");
	if(Accountno==30287654) {
	    System.out.println(accountHolder1.getpersonname()+" "+accountHolder1.getaccountno()+" "+accountHolder1.getaccountBalance()+" "+BankDetails.getifsccode());
	}
	else {
		System.out.println("Invalid details");
	}
		
	}
}