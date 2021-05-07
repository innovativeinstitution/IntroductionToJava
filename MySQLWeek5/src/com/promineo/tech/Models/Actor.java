package com.promineo.tech.Models;

public class Actor {
	private int Id;
	private String FirstName;
	private String LastName;
	
	public Actor(int id, String firstName, String lastName)
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
	
	public String getLastName()
	{
		return LastName;
	}
	
			
	public String toString()
	{
		return "ActorId: " + Id + ", FirstName: " + FirstName + ", LastName: " + LastName;
	}
}
