package com.promineo.tech.student;

import java.util.ArrayList;

import com.promineo.tech.Models.Student;
import com.promineo.tech.Service.StudentService;

public class StudentConsole {

	public static void main(String[] args) {
		//Student Application (Console)
		try
		{
			StudentService studentService = new StudentService();
			
			//Create 3 Students
			System.out.println("Creating 3 new students...");
			studentService.createStudent(new Student(0, "Manish", "Narayan"));
			studentService.createStudent(new Student(0, "Bob", "Smith"));
			studentService.createStudent(new Student(0, "John", "Doe"));
			
			//Get All Students
			System.out.println("Reading all students...");
			ArrayList<Student> students = studentService.getStudents();
			for (Student student : students)
			{
				System.out.println(student);
			}
			
			//Get Student by Id = 2
			System.out.println("Getting Student having Id = 2...");
			Student student = studentService.getStudent(2);
			if(student != null)
			{
				System.out.println(student);
			}
			else
			{
				System.out.println("Student does not exist");
			}
			
			//Delete Student by Id = 3
			System.out.println("Deleting Student having Id = 3...");
			Student student3 = studentService.getStudent(3);
			if(student3 != null)
			{
				studentService.deleteStudent(student3);
			}
			else
			{
				System.out.println("Student does not exist");
			}
			
			//Get All Students
			System.out.println("Reading all students...");
			students = studentService.getStudents();
			for (Student s : students)
			{
				System.out.println(s);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
