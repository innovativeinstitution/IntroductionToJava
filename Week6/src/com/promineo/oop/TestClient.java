package com.promineo.oop;

public class TestClient {

	public static void main(String[] args) {
        
		CheckingAccount checkingAccount = new CheckingAccount(100.00, "Manish's Checking Account");
		//System.out.println(checkingAccount.getAccountName());
		checkingAccount.PrintAccountName();
		
		checkingAccount.deposit(25.00);
		checkingAccount.withdraw(12.00);
		
		System.out.println("Checking Account Balance is: " + checkingAccount.getBalance());
		
		Account account = new Account(200.00, "Manish's Super Account");
	    
		System.out.println("Routing Number: " + checkingAccount.GetRoutingNumber());
		
		Flamingo flamingo = new Flamingo();
		flamingo.Color = "Pink";
		flamingo.Height = 25;
		flamingo.NumberOfWings = 3;
		
		Bird bird = new Bird();
		bird.Color = "Blue";
		bird.NumberOfWings = 2;
		
		bird.Fly();
		flamingo.Fly();
		
		//Car car = new Car(); cannot instantiate object of type Car must inherit
		Honda honda = new Honda(6);
		honda.Accelerate();
		System.out.println(honda.NumberOfTires);
	}
	
	public void TransferFromAccounts(ITransferable account)
	{
		account.Transfer();
	}
}
