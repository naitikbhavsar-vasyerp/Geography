package com.geography.exception;

import lombok.Data;

@Data
public class CityNotFoundException extends RuntimeException{

	public CityNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
