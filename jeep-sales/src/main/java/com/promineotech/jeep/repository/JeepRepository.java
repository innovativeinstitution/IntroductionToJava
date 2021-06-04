package com.promineotech.jeep.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;
import com.promineotech.jeep.entity.Jeep;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JeepRepository implements IJeepRepository {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public FetchJeepsResponse fetchJeeps(FetchJeepsRequest request) {
		log.info("fetching jeeps...");
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
			return response;
		}
		catch(Exception ex)
		{
			log.error(ex.getMessage());
			return response;
		}
	}

}
