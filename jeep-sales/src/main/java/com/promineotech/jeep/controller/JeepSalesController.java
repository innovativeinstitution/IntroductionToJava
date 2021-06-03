package com.promineotech.jeep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.service.IJeepService;

@RestController
public class JeepSalesController implements IJeepSalesController {

	@Autowired
	private IJeepService jeepService;
	
	@Override
	public List<Jeep> fetchJeeps(JeepModel model, String trim) {
		FetchJeepsRequest request = new FetchJeepsRequest();
		request.model = model;
		request.trim = trim;
		FetchJeepsResponse response = jeepService.fetchJeeps(request);
		return response.jeeps;
	}
}
