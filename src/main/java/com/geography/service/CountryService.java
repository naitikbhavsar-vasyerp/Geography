package com.geography.service;

import java.util.List;

import com.geography.dto.CountryDto;
import com.geography.model.Country;

public interface CountryService {
	public List<Country> getCountries();
	public Country addCountry(Country country);
	public String deleteCountry(String countryName);
}
