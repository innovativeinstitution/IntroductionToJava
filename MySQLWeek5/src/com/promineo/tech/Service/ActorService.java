package com.promineo.tech.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.promineo.tech.Models.Actor;
import com.promineo.tech.Repository.SakilaRepository;

public class ActorService {
	private SakilaRepository sakilaRepository;
	
	public ActorService()
	{
		sakilaRepository = new SakilaRepository();
	}
	
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Connection conn = sakilaRepository.getConnection();
		
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from actor");

			while(rs.next())
			{
				actors.add(new Actor(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
			return actors;
		}
		
		return actors;
	}
}
