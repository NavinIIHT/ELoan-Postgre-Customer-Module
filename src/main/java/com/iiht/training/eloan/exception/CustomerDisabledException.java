package com.iiht.training.eloan.exception;

public class CustomerDisabledException extends RuntimeException{

	public CustomerDisabledException(String message) {
		super(message);
	}
}