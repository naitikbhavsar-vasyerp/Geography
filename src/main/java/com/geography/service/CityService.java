package com.geography.service;

import java.util.List;

import com.geography.model.City;

public interface CityService {
	public List<String> getCities(String stateName);
	public City addCity(City city);
	public String deleteCity(String cityName);
}
