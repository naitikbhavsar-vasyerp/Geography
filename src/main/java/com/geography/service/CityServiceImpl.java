package com.geography.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geography.exception.CityNotFoundException;
import com.geography.model.City;
import com.geography.model.State;
import com.geography.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	CityRepository cityRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<String> getCities(String stateName) {
		List<String> cities = cityRepository.findByStateName(stateName);
		return cities;
	}

	@Override
	public City addCity(City city) {
		return cityRepository.save(city);
	}

	@Override
	public String deleteCity(String cityName) {
		if(cityRepository.existsById(cityName)) {
			cityRepository.deleteById(cityName);
		}
		else {
			new CityNotFoundException("City not found for deleting");
		}
		return "City deleted successflly";

	}
	
	
	
}
