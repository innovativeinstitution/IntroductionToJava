package com.promineo.banking;

public class CheckingAccount extends Account {

	public Customer jointCustomer;
	public CheckingAccount(double initBalance) 
	{
		super(initBalance);
	}
	
	public void SetJointCustomer(Customer customer)
	{
		jointCustomer = customer;
	}
}
