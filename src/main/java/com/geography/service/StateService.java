package com.geography.service;

import java.util.List;

import com.geography.dto.CountryDto;
import com.geography.dto.StateDto;
import com.geography.model.State;

public interface StateService {
	public List<String> getStates(String countryName);
	public State addState(State state);
	public String deleteState(String stateName);
}
