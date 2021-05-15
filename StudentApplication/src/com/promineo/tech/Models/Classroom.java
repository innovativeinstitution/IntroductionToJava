package com.promineo.tech.Models;

public class Classroom {
	private int Id;
	private String Name;
	private String Subject;
	
	public Classroom(int id, String name, String subj)
	{
		Id = id;
		Name = name;
		Subject = subj;
	}
	
	public int getId()
	{
		return Id;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String name)
	{
		Name = name;
	}
	
	public String getSubject()
	{
		return Subject;
	}
	
	public void setSubject(String subject)
	{
		Subject = subject;
	}
			
	public String toString()
	{
		return "ClassroomId: " + Id + ", Name: " + Name + ", Subject: " + Subject;
	}
}
