package com.promineo.banking;

public class Customer {

	public String firstName;
	public String lastName;
	private Account account;
	
	public Customer(String fname, String lname)
	{
		firstName = fname;
		lastName = lname;
	}	
	
	public void SetAccount(Account acct)
	{
		account = acct;
	}
	
	public Account GetAccount()
	{
		return account;
	}
}
