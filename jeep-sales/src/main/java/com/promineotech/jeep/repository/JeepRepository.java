package com.promineotech.jeep.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;
import com.promineotech.jeep.entity.Jeep;

@Service
public class JeepRepository extends MySqlRepository implements IJeepRepository {
	private Connection connection;
	
	public JeepRepository()
	{
		connection = super.getConnection("jeep");
	}
	
	@Override
	public FetchJeepsResponse fetchJeeps(FetchJeepsRequest request) {
		FetchJeepsResponse response = new FetchJeepsResponse();
		try
		{
			CallableStatement st = connection.prepareCall("{call getJeepsByModelAndTrim(?, ?)}");
			st.setString(1, request.model.toString());
			st.setString(2, request.trim);
			
			boolean hasResult = st.execute();
			if(hasResult)
			{
				ResultSet rs = st.getResultSet();

				response.jeeps = new ArrayList<Jeep>();
				while(rs.next())
				{
					Jeep jeep = new Jeep(rs.getLong(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getBigDecimal(6));
					response.jeeps.add(jeep);
				}
			}
			return response;
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
			return response;
		}
	}

}
