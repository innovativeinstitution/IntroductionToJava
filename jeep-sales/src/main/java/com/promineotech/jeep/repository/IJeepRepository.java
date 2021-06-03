package com.promineotech.jeep.repository;

import java.util.List;

import com.promineotech.jeep.entity.FetchJeepsRequest;
import com.promineotech.jeep.entity.FetchJeepsResponse;
import com.promineotech.jeep.entity.Jeep;

public interface IJeepRepository {
	FetchJeepsResponse fetchJeeps(FetchJeepsRequest request);
}
