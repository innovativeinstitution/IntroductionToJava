package com.promineotech.jeep.repository;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;

public interface IJeepRepository {
	FetchJeepsResponse fetchJeeps(FetchJeepsRequest request);
}
