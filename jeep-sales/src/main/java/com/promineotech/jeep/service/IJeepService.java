package com.promineotech.jeep.service;

import java.util.List;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;
import com.promineotech.jeep.entity.Jeep;

public interface IJeepService {
	FetchJeepsResponse fetchJeeps(FetchJeepsRequest request);
}
