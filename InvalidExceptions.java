package com.bridgelabz.userregistration;

@SuppressWarnings("serial")
public class InvalidExceptions extends Exception {
	enum ExceptionType{
		ENTERED_NULL, ENTERED_INVALID;
	}

	ExceptionType type;
	public InvalidExceptions(ExceptionType type, String msg) {
		super(msg);
		this.type = type;
	}

}
