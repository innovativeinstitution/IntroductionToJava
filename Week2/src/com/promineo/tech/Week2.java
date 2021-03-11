package com.promineo.tech;

import java.util.ArrayList;

public class Week2 {

	public static void main(String[] args) {
		System.out.println("Welcome to Week2: Conditions and Loops");
		
		//Comparison Operators
		//==, !=, >, >=, <, <=
		//4 == 4 TRUE
		//6 == 4 FALSE
		//6 != 4 TRUE
		//4 != 6 TRUE
		//5 != 5 FALSE
		//100 > 10 TRUE
		//55 < 44 FALSE
		//55 <= 44 FALSE
		//55 <= 55 TRUE <= less than OR equal to
		//120 > 33 TRUE
		//120 >= 123 FALSE
		//120 >= 120 TRUE
		
		int x = 10;
		int y = 20;
		boolean result = x <= y;
		System.out.println(result);
		
		int car1Acceleration = 24;
		int car2Acceleration = 32;
		System.out.println("Result of Acceleration: " + (car1Acceleration < car2Acceleration));
		//car1.acceleration > car2.acceleration
		
		double radius1 = 3.14;
		double radius2 = 5.67;
		double radius3 = 10.14;
		result = (radius1 + radius2) == radius3; //PEMDAS Paranetheis, exponent, mult., div., add., subt.
		System.out.println(result);
		
		//Logical Operator
		//&&, ||, ! -Logical AND, Logical OR, Logical NOT (Negation)
		//(10 < 2) || (5 >= 3)
		// F || T (F = 0, T = 1)
		// TRUE
		// F || F >> FALSE
		// T || F >> TRUE
		// F || T >> TRUE
		// T || T >> TRUE
	    //(10 > 2) && (5 < 3)
		// T && F
		// FALSE
		//((10 < 2) || !(5 >= 3)) && (45 != 46)
		//(F || !T) && (45 != 46)
		//(F || F) && (T)
		// F && T >>> FALSE
		
		//Conditional Statements
		//IF, IF-ELSE, IF-ELSEIF-ELSE
		int age = 10;
		if(age <= 50)
		{
			System.out.println("My age is less than 50");
		}
		
		if(true)
		{
			//code block
			System.out.println("This will definitely run!!!");
			System.out.println("This is the second statement");
		}
		
		if(true)
			System.out.println("This well run");
		System.out.println("this is the second statement");
		
		//if(period == endofmonth)
		//{
		//  PrintReports();
		//}
		
		//Task: If age is less than or equal 25 then the ticket price is free, 
		//      if age is less than or equal 55 then ticket price is 10.50
		//      otherwise its 30.25
		int myage = -5;
		double price = 0;
		boolean ageIsValid = true;
		if (myage <= 0)
		{
			System.out.println("Invalid Age!!!");
			ageIsValid = false;
		}
		else if(myage <= 25)
		{
			price = 0;
		}
		else if(myage <= 55)
		{
			price = 10.50;
		}
		else
		{
			price = 30.25;
		}
		
		if(ageIsValid)
		{
			System.out.println("My Ticket price is: $" + price);
		}
			
		//Ternary Operator
		int num1 = 100;
		String display = "";
		if(CHeckGasTankEmpty())
		{
			//if(some other ccondition) //nested statements
			display = "Gas Tank is Empty";
		}
		else
		{
			display = "Enough Gas remaining";
		}
			
		System.out.println(display);
			
		display = CHeckGasTankEmpty() ? "Gas Tank is Empty" : "Enough Gas remaining";
		System.out.println(display);
		
		//Switch Statements
		String color = "green";
		switch (color) {
		case "orange": 
			System.out.println("Color is Orange");
			break;
		case "blue":
			System.out.println("Color is Orange");		
			break;
		default:
			System.out.println("Invalid color");
		}
		
		int choice = 2;
		switch (choice) {
		case 1: 
			System.out.println("Player 1");
			break;
		case 2: 
			System.out.println("Player 2");
			int totalPlayers = 10;
			if(totalPlayers >= 4)
			{
				System.out.println("This is an additional if statement nested inside a switch statement");
			}
			break;
		case 3: 
			System.out.println("Player 3");
			break;
		default:
			System.out.println("Invalid player choice");
		}
		
		//Loops
		//for loop
		//while
		//do-while
		
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		//System.out.println("Hello");
		
		for (int i = 1; i <= 5; i++) //int i = 1 Counter, i <= 5 Condition to check, increment operator
		{
			System.out.println("Hello");
		}
		
		//1 + 2 + 3 + 4 + 5 + 6 + ... 100???? 5050
		//1+99 = 100
		//2+98 = 100
		
		int sum = 0;
		for (int i = 10; i <= 100; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		//While loop
		int z = 1;
		
		while(z <= 5)
		{
			System.out.println("while loop prints");
			z++;
		}
		
		//Do-While Loop
		int a = 1;
		
		do
		{
			System.out.println("do while loop prints");
			a++;
		}while(a >= 5);
		
		//foreach(car in factory)
		//{
		//	BuildCar(car);
	    //}
		
		for(int i = 0; i <= 100; i++)
		{
			if(i % 3 == 0)
			{
				System.out.println("The number " + i + " is divisible by 3");
			}
		}
	}

	private static boolean CHeckGasTankEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


}
