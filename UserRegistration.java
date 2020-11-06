package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

import com.junituserregistration.UserValidator;

public class UserRegistration {

	// Test Case for FirstName return true
	@Test
	public void checkingFirstName() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isFirstNameValid = null;
		try {
			isFirstNameValid = validator.checkFirstName("Rekha");
		} catch (InvalidExceptions e) {

			Assert.assertEquals("Success", isFirstNameValid);
		}
	}

	// Test Case for FirstName return False
	@Test
	public void checkingFirstNameInvalidMReturnFalse() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isFirstNameInvalid = null;
		try {
			isFirstNameInvalid = validator.checkFirstName("rekha");
		} catch (InvalidExceptions e) {

			Assert.assertEquals(InvalidExceptions.ExceptionType.ENTERED_INVALID, isFirstNameInvalid);
		}
	}

	// Test Case for LastName return True
	@Test
	public void checkingLastName() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isLastNameValid = null;

		try {
			isLastNameValid = validator.checkLastName("Jambhulkar");
		} catch (InvalidExceptions e) {

			Assert.assertEquals("Success", isLastNameValid);
		}
	}

	// Test Case for LastName return False
	@Test
	public void checkingLastNameInvalidMustReturnFalse() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isLastNameInvalid = null;

		try {
			isLastNameInvalid = validator.checkLastName("jambhulkar");
		} catch (InvalidExceptions e) {

			Assert.assertEquals(InvalidExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}

	// Test Case for EmailId return True
	@Test
	public void checkingEmailId() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isEmailIdValid = null;
		try {
			isEmailIdValid = validator.checkEmailId("jambhulkarrekha@gmail.com");
		} catch (InvalidExceptions e) {

			Assert.assertEquals("Success", isEmailIdValid);
		}
	}

	// Test Case for EmailId return False
	@Test
	public void checkingEmailIdInvalidMustReturnFalse() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isEmailIdInvalid = null;
		try {
			isEmailIdInvalid = validator.checkEmailId(".jambhulkarrekha@111");
		} catch (InvalidExceptions e) {

			Assert.assertEquals(InvalidExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}

	// Test Case for MobileNo return True
	@Test
	public void checkingMobileNo() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isMobileNoValid = null;
		try {
			isMobileNoValid = validator.checkMobileNo("91 9138124143");
		} catch (InvalidExceptions e) {

			Assert.assertEquals("Success", isMobileNoValid);
		}
	}

	// Test Case for MobileNo return False
	@Test
	public void checkingMobileNoInvalidMustReturnFalse() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isMobileNoInvalid = null;
		try {
			isMobileNoInvalid = validator.checkMobileNo("656965241");
		} catch (InvalidExceptions e) {

			Assert.assertEquals(InvalidExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}

	// Test Case for Password return True
	@Test
	public void checkingPassWord() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isPassWordValid = null;
		try {
			isPassWordValid = validator.checkPassWord("Rekha@123");
		} catch (InvalidExceptions e) {

			Assert.assertEquals("Success", isPassWordValid);
		}
	}

	// Test Case for Password return False
	@Test
	public void checkingPassWordInvalidMustReturnFalse() throws InvalidExceptions {
		UserValidator validator = new UserValidator();
		String isPassWordInvalid = null;
		try {
			isPassWordInvalid = validator.checkPassWord("rek1f");
		} catch (InvalidExceptions e) {

			Assert.assertEquals(InvalidExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}

	}

	// Test case for mood analyzer return HAPPY
	@Test
	public void moodAnalyserReturnHappy() throws Exception {
		UserValidator validator = new UserValidator();
		String isMoodHappy = null;
		try {
			isMoodHappy = validator.moodAnalyse("Rekha", "Jambhulkar", "jambhulkarrekha@gmail.com", "91 9822626490",
					"Rekha@123");
		} catch (InvalidExceptions e) {

			Assert.assertEquals("Happy", isMoodHappy);
		}
	}

	// Test case for mood analyzer return SAD
	@Test
	public void moodAnalyser_ReturnSAD() throws Exception {
		UserValidator validator = new UserValidator();
		String isMoodSad = null;
		try {
			isMoodSad = validator.moodAnalyse("riya", "jambhulkar", "jambhulkarrekha@+.com", "9822626490", "riya123");
		} catch (InvalidExceptions e) {

			Assert.assertEquals(InvalidExceptions.ExceptionType.ENTERED_INVALID, e.type);
		}
	}
}
