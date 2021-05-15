package com.promineo.tech.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.promineo.tech.Models.Classroom;

public class ClassroomRepository extends MySqlRepository implements IClassroomRepository {
	private Connection connection;
	public ClassroomRepository()
	{
		connection = super.getConnection("university");
	}
	
	@Override
	public ArrayList<Classroom> getClassrooms() {
		ArrayList<Classroom> classrooms = new ArrayList<Classroom>();

		try
		{
			CallableStatement st = connection.prepareCall("{call getClassrooms()}");
			boolean hasResult = st.execute();
			if(hasResult)
			{
				ResultSet rs = st.getResultSet();

				while(rs.next())
				{
					classrooms.add(new Classroom(rs.getInt(1), rs.getString(2), rs.getString(3)));
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
			return classrooms;
		}
		
		return classrooms;
	}
	@Override
	public Classroom getClassroom(int classroomId) {
		try
		{
			CallableStatement st = connection.prepareCall("{call getClassroomById(?)}");
			st.setInt(1, classroomId);
			
			boolean hasResult = st.execute();
			if(hasResult)
			{
				ResultSet rs = st.getResultSet();

				while(rs.next())
				{
					return new Classroom(rs.getInt(1), rs.getString(2), rs.getString(3));
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
	public void createClassroom(Classroom classroom) {
		try
		{
			CallableStatement st = connection.prepareCall("{call createClassroom(?, ?)}");
			st.setString(1, classroom.getName());
			st.setString(2, classroom.getSubject());
			st.execute();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public void deleteClassroom(Classroom classroom) {
		try
		{
			CallableStatement st = connection.prepareCall("{call deleteClassroom(?)}");
			st.setInt(1, classroom.getId());
			st.execute();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public void updateClassroom(Classroom classroom) {
		try
		{
			CallableStatement st = connection.prepareCall("{call updateClassroom(?, ?, ?)}");
			st.setInt(1, classroom.getId());
			st.setString(2, classroom.getName());
			st.setString(3, classroom.getSubject());
			st.execute();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
