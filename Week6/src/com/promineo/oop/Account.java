package com.promineo.oop;

public class Account {
	private double balance;
	public String accountName;

	public Account(double initBalance, String nickname)
	{
		balance = initBalance;
		accountName = nickname;
		
	}
	
	public void deposit(double amount)
	{
		balance += amount; //balance = balance + amount;
	}
	
	public boolean withdraw(double amount) //throws InsufficientFundsException
	{
		//Encapsulation and business rules
		if(amount <= balance)
		{
			balance -= amount; // balance = balance - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String getAccountName()
	{
		return accountName;
	}
	
	public void setAccountName(String nickName)
	{
		accountName = nickName;
	}
	
	public double getBalance()
	{
		return balance;
	}
}
