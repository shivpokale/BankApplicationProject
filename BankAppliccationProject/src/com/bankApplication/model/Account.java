package com.bankApplication.model;

public class Account {
	
	private long accountNumber;
	private String name;
	private String adharcardNumber;
	private String pancard;
	private long contact;
	private String email;
	private double accountBalance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accNo) {
		this.accountNumber = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharcardNumber() {
		return adharcardNumber;
	}
	public void setAdharcardNumber(String adharcardNumber) {
		this.adharcardNumber = adharcardNumber;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		
		return " Account Details:"+"\n________________________"
				+ " \n accountNumber = " + accountNumber + "\n name = " + name + "\n adharcardNumber = " + adharcardNumber
				+ "\n pancard = " + pancard + "\n contact = " + contact + "\n email = " + email + "\n accountBalance = "
				+ accountBalance + "\n________________________" ;
	}
	
	

}
