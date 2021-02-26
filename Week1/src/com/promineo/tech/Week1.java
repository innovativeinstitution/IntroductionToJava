package com.promineo.tech;

public class Week1 {

	public static void main(String[] args) {	
		/* Introduction To Java
		 * Week1
		 * This is a comment block
		 */
		
		//This is a single line comment
		
		//Variable Names must start with a letter, underscore, or $ sign
		//Examples: numOfTires, _someVariable, $test123
		
		//Integer Data Types
		byte smallValue;
		short pageSize;
		int numOfWords;
		long bigValue;
		
		//Declaring Integer Types
		long largeValue = 19999999L;
		int xCoordinate = 3;
		int yCoordinate = 5;
		byte luckyNum = 7;
		short smallNum = 1234;
		
		//Declare Variable using Single Declaration
		int numOfTires = 4, numOfEngines = 2, numOfSeats = 8;
		
		//Floating-Point Data Types
		double distanceOfSun = 1.496E8;
		float massOfElectron = 9E-28F;
		float myWeight = 155.2F;
		
		//Fixing a value of a variable (Constants)
		final int FEET_IN_YARD = 3;
		final double CM_PER_INCH = 2.5;
		
		//Arithmetic Calculations
		//Declare and initialize variables
		int numOfOranges = 7;
		int numOfApples = 10;
		int numOfFruit = 0;
		
		numOfFruit = numOfOranges + numOfApples;
		System.out.println("Total fruit: " + numOfFruit);
		
		//Basic Calculations
		int x = (3*2) + 8/2 - 10^2;
		System.out.println("Calculation Result: " + x);
		
		//Modulus
		int remainder = 5 % 3; //remainder after division
		System.out.println("Remainder is: " + remainder);
		
		//Increment Decrement Operators
		int count = 20;
		System.out.println("Count is: " + count);
		++count; //equivalent to count = count + 1;
		System.out.println("Count is now: " + count);		
		--count; //equivalent to count = count - 1;
		System.out.println("Count is now: " + count);
		
		//op= Operators
		int i = 3;
		i += 5; //equivalent to i = i + 5;
		i *= 2; //equivalent to i = i * 2;
		i -= 7; //equiavalent to i = i - 7;
		i /= 3; //equivalent to i = i / 3;
		
		//Math class 
		double radiusOfCircle = 3.2;
		double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
		System.out.println("Area of circle is: " + areaOfCircle);
		
		//Characters and Strings
		char letter1 = 'A';
		char letter2 = 'B';
		char letter3 = 'C';
		System.out.println(letter1 + "," + letter2 + "," + letter3);
		
		String firstName = "Manish";
		String lastName = "Narayan";
		String fullName = firstName + " " + lastName; //concatenate strings
		System.out.println("Hello " + fullName);
		
	    //Boolean Data Type
		boolean isCarRunning = true;
		boolean emailSent = false;
	}
}
