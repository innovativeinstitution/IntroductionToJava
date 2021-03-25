package com.promineo.banking;

//blueprint for class called Account
public class Account {
	//1. Define Properties (well-defined)
	protected double balance; //0.0 //private
	public String nickName; //""
	
	//2. Define Constructors (helps clients to initialize the object)
	public Account(double initBalance)
	{
		balance = initBalance;
	}
	
	public Account(double initBalance, String name)
	{
		balance = initBalance;
		nickName = name;
	}
	
	//3. Define methods for your class
	public void Deposit(double amount)
	{
		balance += amount; //balance = balance + amount;
	}
	
	public boolean Withdraw(double amount) //throws InsufficientFundsException
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
	
	//Getter
	public double GetBalance()
	{
		return balance;
	}
	
	//Getter
	public String GetAccountName()
	{
		return nickName;
	}

	//Setter
	public void SetAccountName(String name)
	{
		nickName = name;
	}
	
	public void DisplayBalance()
	{
		System.out.println("Account balance is: " + balance);
	}
	
	public void DisplayAccountName()
	{
		System.out.println("Account name is: " + nickName);
	}
}
