package com.bridgelabz.uservalidator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Interface
interface patternInterface {
	boolean validPattern(String key, String value);
}

public class UserValidator {
	patternInterface LambdaPatternCheck = (String key, String value) -> {
		Pattern pattern = Pattern.compile(key);
		Matcher match = pattern.matcher(value);

		boolean result = match.matches();
		return (result);
	};

	private static String FirstName = "^[A-Z][a-z]{3,}";
	private static String LastName = "^[A-Z][a-z]{3,}";
	private static String MobileNo = "^[0-9]{1,2}[ ][0-9]{10}$";
	private static String EmailId = "^[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-.+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
			+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}" + "+[a-zA-Z]{2,}){0,1}";
	private static String PassWord = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[#@$^+=&%])" + "(?=\\S+$).{8,}$";

	int Analyzer = 0;
	private boolean LambdaPatternCheck(String key, String value) {
		return true;
	}
	// Function for Checking the FirstName
	public boolean checkFirstName(String fName) {
		try {
			boolean result= LambdaPatternCheck(FirstName,fName);
			return result;
			} 
		catch (NullPointerException e) {
			return false;
		}
	}

	// Function for Checking the LastName
	public boolean checkLastName(String LName) {
		try {
			boolean result= LambdaPatternCheck(LastName,LName);
			return result;
			} 
		catch (NullPointerException e) {
			return false;
		}
	}
	// Function for Checking the EmailId
	public boolean checkEmailId(String emailId) {
		try {
			boolean result= LambdaPatternCheck(EmailId,emailId);
			return result;
			} 
		catch (NullPointerException e) {
			return false;
		}
	}

	// Function for Checking the MobileNo
	public boolean checkMobileNo(String mobileNo) {
		try {
			boolean result= LambdaPatternCheck(MobileNo,mobileNo);
			return result;
			} 
		catch (NullPointerException e) {
			return false;
		}
	}

	// Function for Checking the PassWord
	public boolean checkPassword(String password) {
		try {
			boolean result= LambdaPatternCheck(PassWord,password);
			return result;
			} 
		catch (NullPointerException e) {
			return false;
		}
	}
}

