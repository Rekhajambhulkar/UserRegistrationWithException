package com.bridgelabz.uservalidator;

public class UserValidator {

	// Function for Checking the FirstName
	public boolean checkFirstname(String fName) {
		return (fName.matches("^[A-Z][a-z]{3,}"));
	}
}
