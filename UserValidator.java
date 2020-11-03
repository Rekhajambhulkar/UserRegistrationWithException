package com.bridgelabz.uservalidator;

public class UserValidator {

	// Function for Checking the FirstName
	public boolean checkFirstname(String fName) {
		return (fName.matches("^[A-Z][a-z]{3,}"));

	}

	// Function for Checking the LastName
	public boolean checkLastName(String Lname) {
		return (Lname.matches("^[A-Z][a-z]{3,}"));
	}

	// Function for Checking the EmailId
        public boolean checkEmailId(String emailId) {
                return (emailId.matches("^[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-.+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
			+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}" + "+[a-zA-Z]{2,}){0,1}"));
        }

	// Function for Checking the MobileNo
	public boolean checkMobileNo(String MobileNo) {
		return (MobileNo.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
	}

	// Function for Checking the PassWord
	public boolean checkPassWord(String Password) {
		return (Password.matches("^[a-zA-Z]{8,}$"));
	}
}
