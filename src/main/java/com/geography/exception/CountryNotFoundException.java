package com.geography.exception;

import lombok.Data;

@Data
public class CountryNotFoundException extends RuntimeException{

	public CountryNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
