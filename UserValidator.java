package com.bridgelabz.uservalidator;

public class UserValidator extends Exception {
	private static String FirstName = "^[A-Z][a-z]{3,}";
	private static String LastName = "^[A-Z][a-z]{3,}";
	private static String MobileNo = "^[0-9]{1,2}[ ][0-9]{10}$";
	private static String EmailId = "^[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-.+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
			+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}" + "+[a-zA-Z]{2,}){0,1}";
	private static String PassWord = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[#@$^+=&%])" + "(?=\\S+$).{8,}$";

	// Function for Checking the FirstName
	public String checkFirstName(String fName) throws InvalidExceptions {
		try {
			if (FirstName.matches(FirstName)) {
				return "Succes";
			} else {
				throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_INVALID,
						"Please entered Valid firstname");
			}
		} catch (NullPointerException e) {
			throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_NULL,
					"Please don't entered null value");
		}
	}

	// Function for Checking the LastName
	public String checkLastName(String LName) throws InvalidExceptions {
		try {
			if (LName.matches(LastName)) {
				return "Succes";
			} else {
				throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_INVALID,
						"Please entered Valid Lastname");
			}
		} catch (NullPointerException e) {
			throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_NULL, "Please entered Valid LastName");
		}
	}

	// Function for Checking the EmailId
	public String checkEmailId(String EmailId) throws InvalidExceptions {
		try {
			if (EmailId.matches(EmailId)) {
				return "Succes";
			} else {
				throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_INVALID,
						"Please entered Valid EmailId");
			}
		} catch (NullPointerException e) {
			throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_INVALID,
					"Please don't entered null value");
		}
	}

	// Function for Checking the MobileNo
	public String checkMobileNo(String mobileNo) throws InvalidExceptions {

		try {
			if (mobileNo.matches(MobileNo)) {
				return "Succes";
			} else {
				throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_INVALID,
						"Please entered Valid MobileNo");
			}
		} catch (NullPointerException e) {
			throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_NULL,
					"Please don't entered null value");
		}
	}

	// Function for Checking the PassWord
	public String checkPassWord(String Password) throws InvalidExceptions {
		try {
			if (Password.matches(PassWord)) {
				return "Succes";
			} else {
				throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_INVALID,
						"Please entered Valid Password");
			}
		} catch (NullPointerException e) {
			throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_NULL,
					"Please don't entered null value");

		}
	}

	// Function for Checking Mood is HAPPY OR SAD
	public String moodAnalyse(String fName, String Lname, String EmailId, String MobileNo, String Password)
			throws Exception {
		try {
			if (checkFirstName(fName) == "Success" && checkLastName(Lname) == "Success"
					&& checkEmailId(EmailId) == "Success" && checkMobileNo(MobileNo) == "Success"
					&& checkPassWord(Password) == "Success") {
				return "HAPPY";
			} else {
				return "SAD";
			}
		} catch (NullPointerException e) {
			throw new InvalidExceptions(InvalidExceptions.ExceptionType.ENTERED_NULL,
					"Please don't entered null value");
		}
	}
}

