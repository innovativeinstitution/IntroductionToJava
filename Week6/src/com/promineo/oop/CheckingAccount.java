package com.promineo.oop;

public class CheckingAccount extends Account implements ITransferable, IPrintable {
	private String RoutingNumber;
	
	public CheckingAccount(double initBalance, String nickname) {
		super(initBalance, nickname);
		RoutingNumber = "1234567890";
	}
	
	public void PrintAccountName()
	{
		System.out.println(super.getAccountName());
	}
	
	public String GetRoutingNumber()
	{
		return RoutingNumber;
	}

	@Override
	public void Transfer() {
		System.out.println("Transferring funds from Checking Account...");
	}
	
	@Override
	public void Print()
	{
		System.out.println("Printing Checking Acccount Checks");
	}
}
