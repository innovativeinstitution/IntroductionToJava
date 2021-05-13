package com.promineo.tech.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.promineo.tech.Models.Student;

public class StudentRepository extends MySqlRepository implements IStudentRepository {
	private Connection connection;
	public StudentRepository()
	{
		connection = super.getConnection("university");
	}
	
	@Override
	public ArrayList<Student> getStudents() {
		ArrayList<Student> students = new ArrayList<Student>();

		try
		{
			CallableStatement st = connection.prepareCall("{call getStudents()}");
			boolean hasResult = st.execute();
			if(hasResult)
			{
				ResultSet rs = st.getResultSet();

				while(rs.next())
				{
					students.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
			return students;
		}
		
		return students;
	}
	@Override
	public Student getStudent(int studentId) {
		try
		{
			CallableStatement st = connection.prepareCall("{call getStudentById(?)}");
			st.setInt(1, studentId);
			
			boolean hasResult = st.execute();
			if(hasResult)
			{
				ResultSet rs = st.getResultSet();

				while(rs.next())
				{
					return new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
		
		return null;
	}
	
	@Override
	public void createStudent(Student student) {
		try
		{
			CallableStatement st = connection.prepareCall("{call createStudent(?, ?)}");
			st.setString(1, student.getFirstName());
			st.setString(2, student.getLastName());
			st.execute();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public void deleteStudent(Student student) {
		try
		{
			CallableStatement st = connection.prepareCall("{call deleteStudent(?)}");
			st.setInt(1, student.getId());
			st.execute();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
