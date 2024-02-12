package com.geography.exception;

import lombok.Data;

@Data
public class StateNotFoundException extends RuntimeException{

	public StateNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
