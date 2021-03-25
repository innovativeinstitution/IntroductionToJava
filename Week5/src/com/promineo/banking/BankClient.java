package com.promineo.banking;

import java.util.ArrayList;

public class BankClient {

	public static void main(String[] args) {
		
		/*try
		{
		*/
		Account manishAccount = new Account(50.00); //open account with initial balance
		//Account manishAccount = new Account(); //reference data types, int x = 10 this is a primitive data types
		//manishAccount.balance = 50.00;
		manishAccount.nickName = "Manish Savings Account";
		manishAccount.Deposit(15.50);
	    manishAccount.Withdraw(2.00);
		//System.out.println(manishAccount.GetBalance());
		manishAccount.DisplayBalance();
		
		Account adamAccount = new Account(75.00, "Adams Checking Account");
		adamAccount.Deposit(20.00);
		adamAccount.DisplayBalance();
		adamAccount.DisplayAccountName();
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(manishAccount);
		accounts.add(adamAccount);
		
		for(Account acc : accounts)
		{
			acc.DisplayAccountName();
			acc.DisplayBalance();
		}
		
		if(manishAccount.Withdraw(1000))
		{
			System.out.println("Withdrawal Success!");
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
		
		
		Customer customer1 = new Customer("Manish", "Narayan");
		customer1.SetAccount(manishAccount);
		
		customer1.GetAccount().DisplayBalance();
		
		
		CheckingAccount manishCheckingAccount = new CheckingAccount(120.00);
		manishCheckingAccount.nickName = "Manish Checking Account";
		manishCheckingAccount.DisplayBalance();
		manishCheckingAccount.SetJointCustomer(customer1);
		
		Customer manishCustomer = manishCheckingAccount.jointCustomer;
		manishCustomer.GetAccount().DisplayBalance();
		
		
		/*}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		*/
	}
}
