package com.geography.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geography.exception.CountryNotFoundException;
import com.geography.model.Country;
import com.geography.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryRepository countryRepository;

	ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<Country> getCountries() {
		List<Country> countries = countryRepository.findAll();
		return countries;
	}

	@Override
	public Country addCountry(Country country) {
		return countryRepository.save(country);
	}

	@Override
	public String deleteCountry(String countryName) {
		if (countryRepository.existsById(countryName)) {
			countryRepository.deleteById(countryName);
		} else {
			new CountryNotFoundException("Country not found for deleting");
		}
		return "Country deleted successflly";
	}

}
