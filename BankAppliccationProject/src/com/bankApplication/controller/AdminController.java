package com.bankApplication.controller;

import java.util.Scanner;
import com.bankApplication.service.*;
import com.bankApplication.serviceImpl.SBIImpl;

public class AdminController {
	
	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println("       ____________________       ");
		System.out.println("=======|Welcome to SBI Bank|=======");
		System.out.println("       |___________________|       ");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		RBI rbi = new SBIImpl();
		
		while(flag) {
		System.out.println("__________________________________");
		System.out.println("|-- 1. Create Account            |");
		System.out.println("|-- 2. Show Account Details      |");
		System.out.println("|-- 3. Show Account Balance      |");
		System.out.println("|-- 4. Withdraw Money            |");
		System.out.println("|-- 5. Deposit Money             |");
		System.out.println("|-- 6. Update Account Details    |");
		System.out.println("|-- 7. Exit                      |");
		System.out.println("|________________________________|");
		System.out.println(" = Enter your choice from 1 to 7");
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			rbi.createAccount();
			break;
		case 2:
			rbi.showAccountDetails();
			break;
		case 3:
			rbi.showAccountBalance();
			break;
		case 4:
			rbi.withdrawMoney();
			break;
		case 5:
			rbi.depositMoney();;
			break;
		case 6:
			rbi.updateAccountDetails();
			break;
		case 7:
			System.out.println("Exit!!!!");
			flag = false;
			break;
			
			default:
				System.out.println("Entered wrong choice please enter correct choice");
				break;
		}
		}
		System.out.println("---------------------------------  ");
		System.out.println("Thank you for banking with us");
		System.out.println("----------------------------------");
		sc.close();

	}

}
