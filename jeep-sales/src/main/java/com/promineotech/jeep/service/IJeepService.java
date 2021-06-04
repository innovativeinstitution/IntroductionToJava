package com.promineotech.jeep.service;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;

public interface IJeepService {
	FetchJeepsResponse fetchJeeps(FetchJeepsRequest request);
}
