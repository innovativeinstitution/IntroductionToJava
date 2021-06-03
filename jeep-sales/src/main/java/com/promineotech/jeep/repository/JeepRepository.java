package com.promineotech.jeep.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;
import com.promineotech.jeep.entity.Jeep;

import lombok.extern.slf4j.Slf4j;

@Service
//@Slf4j
public class JeepRepository extends MySqlRepository implements IJeepRepository {
	private Connection connection;
	//private Logger logger;
	
	//@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	public JeepRepository()
	{
		//connection = super.getConnection("jeep");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jeep");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);		 
	}
	
	@Override
	public FetchJeepsResponse fetchJeeps(FetchJeepsRequest request) {
		//logger.info("Fetching jeeps...");
		FetchJeepsResponse response = new FetchJeepsResponse();
		
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("model", request.model.toString());
			params.put("trim", request.trim);
			
			
			List<Jeep> jeeps = this.jdbcTemplate.query(
			        "call getJeepsByModelAndTrim(:model, :trim)",
			        params,
			        new RowMapper<Jeep>() {
			            public Jeep mapRow(ResultSet rs, int rowNum) throws SQLException {
			                Jeep jeep = new Jeep();
			                jeep.setModelPk(rs.getLong("model_pk"));
			                jeep.setJeepModel(rs.getString("model_id"));
			                jeep.setTrimLevel(rs.getString("trim_level"));
			                jeep.setNumDoors(rs.getInt("num_doors"));
			                jeep.setWheelSize(rs.getInt("wheel_size"));
			                jeep.setBasePrice(rs.getBigDecimal("base_price"));
			                return jeep;
			            }
			        });
			
			response.jeeps = jeeps;
			
			/*CallableStatement st = connection.prepareCall("{call getJeepsByModelAndTrim(?, ?)}");
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
			}*/
			
			return response;
		}
		catch(Exception ex)
		{
			//logger.error(ex.getMessage());
			//System.out.println(ex.getMessage());
			return response;
		}
	}

}
