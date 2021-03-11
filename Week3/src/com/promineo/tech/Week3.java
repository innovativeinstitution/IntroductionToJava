package com.promineo.tech;
import java.util.Arrays;

public class Week3 {

	public static void main(String[] args) {
		//Arrays and Methods
		//Container that holds 5 integers
		int[] myArray = { 1, 2, 3, 4, 5 };
		int[] mySecondArray = new int[5];
        int[] myThirdArray = new int[] { 1, 2, 3, 4, 5};
        
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        
        System.out.println("Length of myArray is: " + myArray.length);
        
        System.out.println(mySecondArray[0]);
        System.out.println(mySecondArray[1]);
        System.out.println(mySecondArray[2]);
        System.out.println(mySecondArray[3]);
        System.out.println(mySecondArray[4]);
        
        //Array of strings...
        String[] students = { "Manish Narayan", "David Rossi", "Juan Hernandez" };
        
        //looping through arrays
        for(int i = 0; i < students.length; i++)
        {
        	System.out.println("Student Name: " + students[i]);
        }
        
        //for(DataType variable in collection (Array, arraylist, List, etc))
        for(String student : students)
        {
        	System.out.println("Student Name: " + student);
        }
        
        /*Car[] cars = { new Car(a), new Car(b) };
        
        for(Car car : cars)
        {
        	car.accelerate();
        }*/
        
        int[] nums = { 1, 2, 3 };
        
        for(int num : nums)
        {
        	System.out.println(num * num);
        }
        
        //first value of any array?
        System.out.println(nums[0]);
        
        //last value of any array?
        System.out.println(nums[nums.length - 1]);
        
        int[] a = { 4, 7, 2 };
        int[] b = { 4, 5, 6 };
        
        //How can i add these two arrays and print out the resulting array?
        int[] c = new int[3]; //or new int[a.length];
        
        for(int i = 0; i < a.length; i++) //looping over a
        {
        	c[i] = a[i] + b[i]; //c[0] = a[0] + b[0] = c[0] = 1 + 4 = 5
        }
        
        
        for(int el : c)
        {
        	MyOwnPrintFunction("The sum of a and b is: " + el);
        	//System.out.println("The sum of a and b is: " + el);
        }
        
        int[][] multiDimArray = new int[3][3];
        multiDimArray[0][0] = 1;
        multiDimArray[0][1] = 2;
        multiDimArray[0][2] = 3;
        multiDimArray[1][0] = 4;
        multiDimArray[1][1] = 5;
        multiDimArray[1][2] = 6;
        
        //sort(a);
        
        //Methods
        int answer = AddTwoNumbers(10, 20);
        System.out.println(answer);
        answer = AddThreeNumbers(10, 20, 30);
        System.out.println(answer);
        
        ThisMethodDoesNotReturnAnything(10, 2.5);
        
        MyOwnPrintFunction("Hello Promineo " + 10);
        
        MyOwnPrintFunction(ThisMethodTakesNoArgumentsButReturnsString());
        
        int[] d = { 4, 7, 2 };
        int[] e = { 4, 5, 6 };
        
        int[] resultArray = AddTwoArrays(d, e);
        
        for(int el : resultArray)
        {
        	System.out.println(el);
        }
        
        boolean isPriceReduced = IsTicketPriceReduced(72);
        System.out.println("Is Ticket Price Reduced?: " + isPriceReduced);
        
        isPriceReduced = IsTicketPriceReduced(25);
        System.out.println("Is Ticket Price Reduced?: " + isPriceReduced);
        
        int[] arrayBeforeSort = { 23, 5, 1, 7, 12, 72 };
        Arrays.sort(arrayBeforeSort);
        
        for(int el : arrayBeforeSort)
        {
        	System.out.println(el);
        }
	}
	
	public static boolean IsTicketPriceReduced(int age)
	{
		if(age > 55)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int AddTwoNumbers(int num1, int num2)
	{
		 return num1 + num2; //business logic
	}
	
	public static int AddThreeNumbers(int num1, int num2, int num3)
	{
		 return num1 + num2 + num3; //business logic
	}
	
	public static void ThisMethodDoesNotReturnAnything(int a, double b)
	{
		double someResult = 0.0;
		someResult = a + b + 2.0*b;
	}
	
	public static void MyOwnPrintFunction(String s)
	{
		System.out.println(s);
	}
	
	public static void ThisMethodTakesNoArguments()
	{
		int result = AddThreeNumbers(10, 20, 30);
	}
	
	public static String ThisMethodTakesNoArgumentsButReturnsString()
	{
		return "Hello There";
	}
	
	public static int[] AddTwoArrays(int[] a, int[] b)
	{
		int[] c = new int[a.length];
		
        for(int i = 0; i < a.length; i++)
        {
        	c[i] = a[i] + b[i]; 
        }
        
        return c;
	}
}
