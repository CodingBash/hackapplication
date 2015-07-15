package com.github.hackapplication.exception;

public class FieldsNotInstantiatedException extends Exception{

	private static final long serialVersionUID = 7335097509923039483L;

	public FieldsNotInstantiatedException() {
		
	}
	
	public FieldsNotInstantiatedException(String message) {
		super(message);
	}
}
