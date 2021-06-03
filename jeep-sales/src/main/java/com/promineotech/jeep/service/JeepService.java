package com.promineotech.jeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.repository.IJeepRepository;

@Service
public class JeepService implements IJeepService {

	@Autowired
	private IJeepRepository jeepRepository;
	
	@Override
	public FetchJeepsResponse fetchJeeps(FetchJeepsRequest request) {
		FetchJeepsResponse response = jeepRepository.fetchJeeps(request);
		return response;
	}

}
