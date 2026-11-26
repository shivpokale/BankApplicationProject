package com.bankApplication.Validation;

import java.util.Scanner;

public class Validation {
	
	public static long getAccountNumber() {
		
		long accNumber = (long) (Math.random()* Math.pow(10,12));
		return accNumber;
	}
	
	public static long getContactNumber() {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		if(number > 6000000000l && number < 9999999999l) {
			return number;
			
		}else {
			System.out.println("Invalid Number");
			return getContactNumber();
		}
		
		 
	}

}

