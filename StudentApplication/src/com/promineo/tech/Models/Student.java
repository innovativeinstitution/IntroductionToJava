package com.promineo.tech.Models;

public class Student {
	private int Id;
	private String FirstName;
	private String LastName;
	
	public Student(int id, String firstName, String lastName)
	{
		Id = id;
		FirstName = firstName;
		LastName = lastName;
	}
	
	public int getId()
	{
		return Id;
	}
	
	public String getFirstName()
	{
		return FirstName;
	}
	
	public void setFirstName(String firstName)
	{
		FirstName = firstName;
	}
	
	public String getLastName()
	{
		return LastName;
	}
	
	public void setLastName(String lastName)
	{
		LastName = lastName;
	}
			
	public String toString()
	{
		return "StudentId: " + Id + ", FirstName: " + FirstName + ", LastName: " + LastName;
	}
}
