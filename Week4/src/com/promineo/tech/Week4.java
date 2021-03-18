package com.promineo.tech;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Week4 {

	public static void main(String[] args) {
		// Collections
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		//nums[3] = 40; cant add dynamically or set new size to basic array
		System.out.println(nums.length);
		//basic array limits size and is not dynamic
		
		String myWord = "Hello There";
		
		//ArrayList - students is an ArrayList of type String
		ArrayList<String> students = new ArrayList<String>();
		students.add("Manish Narayan");
		students.add("David Rossi");
		students.add("Bob Smith");
		
		for(int i = 0; i < students.size(); i++)
		{
			System.out.println(students.get(i));
		}
		
		//ArrayList<Car> cars = new ArrayList<Car>();
		
		for(String student : students)
		{
			System.out.println(student);
		}
		
		//new student enrolled i can add dynamically using arraylist
		students.add("Jodas Bates");
		
		for(String student : students)
		{
			System.out.println(student);
		}
		
		//remove a student as Manish is taking a break from school
		students.remove(0);
		
		for(String student : students)
		{
			System.out.println(student);
		}
		
		//Class was cancelled remove all the students at once!
		students.clear();
		System.out.println(students.size());
		
		for(String student : students)
		{
			System.out.println(student);
		}
		
		//Create a collection of type integer to store employee id's
		//ArrayList<int> 
		int x = 10;
		double y = 22.34;
		String myletters = "hello";
		byte smallNumber = 3;
		//above are all primitive datatypes except String
		
		ArrayList<Integer> employeeIds = new ArrayList<Integer>();
		employeeIds.add(101);
		employeeIds.add(202);
		employeeIds.add(303);
		
		PrintEmployeeIdReport(employeeIds); //High Level Programming and Clean Organized Code
		
		//1.	Create an instance of an ArrayList of String called studentNames
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Manish Narayan");
		studentNames.add("Bob Smith");
		
		//Collection - HashSet
		students.add("Manish Narayan");
		students.add("Manish Narayan");
		
		for(String student : students)
		{
			System.out.println(student);
		}
		
		HashSet<String> uniqueStudents = new HashSet<String>();
		uniqueStudents.add("Bob Smith"); //;lfjkl;sdfjksdlfjsdfsdjfsdjf;s
		uniqueStudents.add("Bob Smith"); //;lfjkl;sdfjksdlfjsdfsdjfsdjf;s
		uniqueStudents.add("Manish Narayan");
		
		if(uniqueStudents.contains("Manish Narayan"));
		{
			System.out.println("collection contains a match");
		}
		
		for(String student : uniqueStudents)
		{
			System.out.println(student);
		}
		
		//2.	Create an instance of a HashSet of Integer called ids
		HashSet<Integer> ids = new HashSet<Integer>();
		ids.add(101);
		ids.add(102);
		
		//Collection - HashMap 
		//3.	Create an instance of a HashMap of Integer, String called studentMap
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		//store all my student id's (Integer) and names (String)
		studentMap.put(1, "John Doe");
		studentMap.put(2, "Bob Jones");
		//we are storing something called KVP Key Value Pairs
		
		for(Integer key : studentMap.keySet())
		{
			System.out.println("Student Id's (Keys) are: " + key);
		}
		
		for(String name : studentMap.values())
		{
			System.out.println("Student Names (Values) are: " + name);
		}
		
		int studentId = 3;
		if(studentMap.containsKey(studentId))
		{
			System.out.println("Student with ID " + studentId + " exists in the school database!");
		}
		else
		{
			System.out.println("Student with ID " + studentId + " does not exist in the school database!");
		}
		
		String studentName = "Bob Jones";
		if(studentMap.containsValue(studentName))
		{
			System.out.println("Student with Name " + studentName + " exists in the school database!");
		}
		else
		{
			System.out.println("Student with Name " + studentName + " does not exist in the school database!");
		}
		
		studentMap.clear();
		
		//5.	Create a variable int i = 0; then iterate over ids using an enhanced for loop. 
		//Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. 
		//The entry should consist of a key that is the id in the enhanced loop’s current iteration, 
		//and a value that is the employeeName at position i of the employeeNames ArrayList. 
		//Increment i so that each iteration grabs the next element in the ArrayList
		
		int i = 0;
		
		for(Integer id : ids)
		{
			studentMap.put(id, studentNames.get(i));
			i++; //i = i + 1;
		}
		
		//PrintStudentIds(studentMap);
		//PrintStudentNames(studentMap);
		
		//6.	Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(), and use the key for each current iteration to print to the console both the current key and its associated value in the map.
		PrintStudentEnrollmentReport(studentMap);
		
		//String Builder
		String word = "A"; //Immutable
		word = word + "B"; //Concatenating 
		word = word + "C"; //Concatenating
		
		System.out.println(word);
		
		StringBuilder myWordBuilder = new StringBuilder();
		myWordBuilder.append("A").append("B").append("C").append("++++++++++++");
		System.out.println(myWordBuilder.toString());
		
		//7.	Create a StringBuilder called idsBuilder.
		//8.	Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		StringBuilder studentIdsBuilder = new StringBuilder();
		for(Integer id : ids)
		{
			studentIdsBuilder.append(id).append("-");
		}
		
		System.out.println(studentIdsBuilder.toString());
	}
	
	public static void PrintEmployeeIdReport(ArrayList<Integer> employeeIds)
	{
		//for each employeeId of type Integer inside of employeeIds loop through
		for(Integer employeeId : employeeIds)
		{
			System.out.println("Employee Id is: " + employeeId);
		}	
	}

	public static void PrintStudentIds(HashMap<Integer, String> studentMap)
	{
		for(Integer studentId : studentMap.keySet())
		{
			System.out.println("Student Id: " + studentId);
		}
	}
	
	public static void PrintStudentNames(HashMap<Integer, String> studentMap)
	{
		for(String studentName : studentMap.values())
		{
			System.out.println("Student Name: " + studentName);
		}
	}
	
	public static void PrintStudentEnrollmentReport(HashMap<Integer, String> studentMap)
	{
		for(Map.Entry<Integer, String> students : studentMap.entrySet())
		{
			System.out.println("Student ID: " + students.getKey() + ", Student Name: " + students.getValue());
		}
	}
}
