package com.promineo.tech.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.promineo.tech.Models.Student;
import com.promineo.tech.Models.Teacher;

public class TeacherRepository extends MySqlRepository implements ITeacherRepository {
	private Connection connection;
	public TeacherRepository()
	{
		connection = super.getConnection("university");
	}
	
	@Override
	public ArrayList<Teacher> getTeachers() {
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();

		try
		{
			CallableStatement st = connection.prepareCall("{call getTeachers()}");
			boolean hasResult = st.execute();
			if(hasResult)
			{
				ResultSet rs = st.getResultSet();

				while(rs.next())
				{
					teachers.add(new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3)));
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
			return teachers;
		}
		
		return teachers;
	}
	@Override
	public Teacher getTeacher(int teacherId) {
		try
		{
			CallableStatement st = connection.prepareCall("{call getStudentById(?)}");
			st.setInt(1, teacherId);
			
			boolean hasResult = st.execute();
			if(hasResult)
			{
				ResultSet rs = st.getResultSet();

				while(rs.next())
				{
					return new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3));
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
	public void createTeacher(Teacher teacher) {
		try
		{
			CallableStatement st = connection.prepareCall("{call createTeacher(?, ?)}");
			st.setString(1, teacher.getFirstName());
			st.setString(2, teacher.getLastName());
			st.execute();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public void deleteTeacher(Teacher teacher) {
		try
		{
			CallableStatement st = connection.prepareCall("{call deleteTeacher(?)}");
			st.setInt(1, teacher.getId());
			st.execute();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public void updateTeacher(Teacher teacher) {
		try
		{
			CallableStatement st = connection.prepareCall("{call updateTeacher(?, ?, ?)}");
			st.setInt(1, teacher.getId());
			st.setString(2, teacher.getFirstName());
			st.setString(3, teacher.getLastName());
			st.execute();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
