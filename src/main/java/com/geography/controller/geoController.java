package com.geography.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geography.dto.ResponseDto;
import com.geography.model.City;
import com.geography.model.Country;
import com.geography.model.State;
import com.geography.service.CityService;
import com.geography.service.CountryService;
import com.geography.service.StateService;

@RestController
@RequestMapping("/geography")
public class geoController {
	
	@Autowired
	CountryService countryService;
	@Autowired
	StateService stateService;
	@Autowired
	CityService cityService;
	
	@GetMapping("/getCountries")
	public ResponseDto getCountries() {
		List<Country> countries = countryService.getCountries();
		return new ResponseDto(200, "Countries fetched successfully", countries);
	}
	@PostMapping("/addCountry")
	public ResponseDto addCountry(@RequestBody Country country) {
		Country country2 = countryService.addCountry(country);
		return new ResponseDto(200, "Country added successfully", country2);
	}
	
	@DeleteMapping("/deleteCountry/{countryName}")
	public ResponseDto deleteCountry(@PathVariable String countryName) {
		return new ResponseDto(200, countryService.deleteCountry(countryName));
			
	}
	
	
	@GetMapping("/getStates/{countryName}")
	public ResponseDto getStates(@PathVariable String countryName) {
		List<String> states = stateService.getStates(countryName);
		return new ResponseDto(200, "States fetched successfully", states);
	}
	@PostMapping("/addState")
	public ResponseDto addState(@RequestBody State state) {
		State state2 = stateService.addState(state);
		return new ResponseDto(200, "State added successfully", state2);
	}
	
	@DeleteMapping("/deleteState/{stateName}")
	public ResponseDto deleteState(@PathVariable String stateName) {
		return new ResponseDto(200, stateService.deleteState(stateName));
			
	}
	
	@GetMapping("/getCities/{stateName}")
	public ResponseDto getCities(@PathVariable String stateName) {
		List<String> cities = cityService.getCities(stateName);
		return new ResponseDto(200, "Cities fetched successfully", cities);
	}
	@PostMapping("/addCity")
	public ResponseDto addCity(@RequestBody City city) {
		City city2 = cityService.addCity(city);
		return new ResponseDto(200, "City added successfully", city2);
	}
	
	@DeleteMapping("/deleteCity/{cityName}")
	public ResponseDto deleteCity(@PathVariable String cityName) {
		return new ResponseDto(200, cityService.deleteCity(cityName));
			
	}
}

