package com.geography.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geography.dto.CountryDto;
import com.geography.exception.CountryNotFoundException;
import com.geography.exception.StateNotFoundException;
import com.geography.model.Country;
import com.geography.model.State;
import com.geography.repository.StateRepository;

@Service
public class StateServiceImpl implements StateService{

	@Autowired
	StateRepository stateRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<String> getStates(String countryName) {
		List<String> states = stateRepository.findByCountryName(countryName);
		return states;
	}

	@Override
	public State addState(State state) {
		return stateRepository.save(state);
	}

	@Override
	public String deleteState(String stateName) {
		if(stateRepository.existsById(stateName)) {
			stateRepository.deleteById(stateName);
		}
		else {
			new StateNotFoundException("State not found for deleting");
		}
		return "State deleted successflly";

	}
	
	
	
}
