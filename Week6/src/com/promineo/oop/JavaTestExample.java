package com.promineo.oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JavaTestExample {

	@Test
	void Test_AddNumbers() {
		Calculator calculator = new Calculator();
		int num1 = 10;
		int num2 = 20;
		
		//Define expected
		int expected = 30;
		
		//Calculator Actual
		int actual = calculator.AddNumbers(num1, num2);
		
		//Assert STatements
		assertNotEquals(expected, actual);
		
	}

}
