package com.bankApplication.serviceImpl;

import java.lang.foreign.ValueLayout;
import java.util.Scanner;

import com.bankApplication.Validation.Validation;
import com.bankApplication.model.Account;
import com.bankApplication.service.RBI;

public class SBIImpl implements RBI {

	Scanner sc= new Scanner(System.in);
	Account ac = new Account();
	boolean isCreated = false;

	 
	@Override
	public void createAccount() {
		//System.out.println("  Enter your account number");
		System.out.println("---------------------------------------");
		//long accNo= sc.nextInt();
		System.out.println("  Enter your name");
		String name = sc.next();
		ac.setName(name);
		
		System.out.println("  Enter your adhar number");
		ac.setAdharcardNumber(sc.next());
		
		System.out.println("  Enter your pancard number");
		ac.setPancard(sc.next());
		
		System.out.println("  Enter your contact number");
	//	System.out.println("---------------------------------------");
		Validation.getContactNumber();
		//ac.setContact(sc.nextLong());
		
		System.out.println("  Enter your email");
		ac.setEmail(sc.next());
	
		System.out.println("  Enter your account Balance");
		ac.setAccountBalance(sc.nextDouble());
		
		long accNumber = Validation.getAccountNumber();
		System.out.println("  Your Account Number is: " + accNumber);
		ac.setAccountNumber(accNumber);
		isCreated = true;
		
		System.out.println("________________________________");
		System.out.println("| Account created succesfully    |");
		System.out.println("|________________________________|");
	}

	@Override
	public void showAccountDetails() {
		
		if(isCreated) {
		System.out.println("Enter your account number");
		int accountNumber = sc.nextInt();
		if(accountNumber == ac.getAccountNumber()) {
			System.out.println(ac);
		
			
		}else {
			System.out.println("Incorrect Account Number");	
		}}
		else {
			System.out.println("Please create your account first..");
			createAccount();
		}
	}

	@Override
	public void showAccountBalance() {
		
		if(isCreated) {
		System.out.println("Enter your Account Number");
		int accountNumber = sc.nextInt();
		if(accountNumber == ac.getAccountNumber()) {
			System.out.println("Current Account Balance:" + ac.getAccountBalance());;
		}
		else {
			System.out.println("Account Doesnt exist");
		}	
		}else {
			System.out.println("Please create your account first..");
			createAccount();
		}
	}

	@Override
	public void withdrawMoney() {
		
		if(isCreated) {
		System.out.println("Enter Account number:");
		int accountNumber = sc.nextInt();
		if(accountNumber == ac.getAccountNumber()) {
		System.out.println("Enter amount you want to withdraw: ");
		double withdrawalAmount = sc.nextDouble();
     	System.out.println("Amount after withdrawing:"+ (ac.getAccountBalance()-withdrawalAmount));
		double WithdrawAmount = ac.getAccountBalance()-withdrawalAmount;
		ac.setAccountBalance(WithdrawAmount);
	}
		else {
			System.out.println("Account Doesnt exist");
		}}else {
			System.out.println("Please create your account first..");
			createAccount();
		}
	}

	@Override
	public void depositMoney() {
		
		if(isCreated) {
		System.out.println("Enter Account Number: ");
		int accountNumber = sc.nextInt();
		if(accountNumber == ac.getAccountNumber()) {
			System.out.println("Enter amount you want to deposit");
			double depositAmount = sc.nextDouble();
			double newAmount = ac.getAccountBalance();
			System.out.println("Current balance after deposit: " + (ac.getAccountBalance()+depositAmount));
		}
	else {
		System.out.println("Account Doesnt exist");
	}
		}else {
		System.out.println("Please create your account first..");
		createAccount();
	}
	}
	
	
	@Override
	public void updateAccountDetails() {
		if(isCreated) {
		boolean flag = true;
		
		RBI rbi = new SBIImpl();
		while(flag) {
			System.out.println("You can select what you want to update");
			System.out.println(" ");
			System.out.println(" -- 1.Name");
			System.out.println(" -- 2.Contact");
			System.out.println(" -- 3.Email");
			System.out.println("Enter choice you want to update");
			int update = sc.nextInt();
		
		switch(update) {
		case 1:
			System.out.println("Enter your name: ");
			ac.setName(sc.next());
			break;
		case 2:
			System.out.println("Enter your contact: ");
			ac.setContact(sc.nextLong());
			break;
		case 3:
			System.out.println("Enter your email: ");
			ac.setEmail(sc.next());
			break;
		case 4:
			flag = false;
			break;
			default:
				System.out.println("Enter correct choice");
				break;
				
			}
		flag=false;
		
		}
		}else {
			System.out.println("Please create your account first..");
			createAccount();
		}
		
	}
}
	


