package com.geography.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.geography.dto.ResponseDto;
import com.geography.exception.CityNotFoundException;
import com.geography.exception.CountryNotFoundException;
import com.geography.exception.StateNotFoundException;

@RestControllerAdvice
public class ExceptionHandler {
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {CountryNotFoundException.class})
	public ResponseDto CountryNotFoundExceptionHandler(CountryNotFoundException countryNotFoundException) {
		return new ResponseDto(404, countryNotFoundException.getMessage(), countryNotFoundException.getStackTrace());
	}
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {StateNotFoundException.class})
	public ResponseDto StateNotFoundExceptionHandler(StateNotFoundException stateNotFoundException) {
		return new ResponseDto(404, stateNotFoundException.getMessage(), stateNotFoundException.getStackTrace());
	}
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {CityNotFoundException.class})
	public ResponseDto CityNotFoundExceptionHandler(CityNotFoundException cityNotFoundException) {
		return new ResponseDto(404, cityNotFoundException.getMessage(), cityNotFoundException.getStackTrace());
	}
	
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {Exception.class})
	public ResponseDto handleGeneralException(Exception exception) {
		return new ResponseDto(500, exception.getMessage(), exception.getStackTrace());
	}
	
}
