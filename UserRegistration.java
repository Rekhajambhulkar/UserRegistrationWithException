package com.bridgelabz.userregistration;

public class UserRegistration {

	// Test Case for FirstName return true
	@Test
	public void checkingFirstname() {
		UserValidator validator = new UserValidator();
		boolean isFirstNameValid = validator.checkFirstname("Rekha");
		Assert.assertTrue(isFirstNameValid);
	}

	// Test Case for FirstName return False
	@Test
	public void checkingFirstNameInvalidReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean isFirstNameInvalid = validator.checkFirstname("riya");
		Assert.assertFalse(isFirstNameInvalid);
	}

	// Test Case for LastName return True
	@Test
	public void checkingLastName() {
		UserValidator user = new UserValidator();
		boolean isLastNameValid = user.checkLastName("Jambhulkar");
		Assert.assertTrue(isLastNameValid);
	}

	// Test Case for LastName return False
	@Test
	public void checkingLastNameInvalidMustReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isLastNameInvalid = user.checkLastName("jambhulkar");
		Assert.assertFalse(isLastNameInvalid);
	}

	// Test Case for EmailId return True
	@Test
	public void checkingEmailId() {
		UserValidator user = new UserValidator();
		boolean isEmailIdValid = user.checkEmailId("jambhulkarrekha@gmail.com");
		Assert.assertTrue(isEmailIdValid);
	}

	// Test Case for EmailId return False
	@Test
	public void checkingEmailIdInvalidMustReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isEmailIdInvalid = user.checkEmailId(".jambhulkarrekha@111");
		Assert.assertFalse(isEmailIdInvalid);
	}

	// Test Case for MobileNo return True
	@Test
	public void checkingMobileNo() {
		UserValidator user = new UserValidator();
		boolean isMobileNoValid = user.checkMobileNo("91 9138124143");
		Assert.assertTrue(isMobileNoValid);
	}

	// Test Case for MobileNo return False
	@Test
	public void checkingMobileNoInvalidMustReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isMobileNoInvalid = user.checkMobileNo("656965241");
		Assert.assertFalse(isMobileNoInvalid);
	}

	// Test Case for Password return True
	@Test
	public void checkingPassWord_OneSpecialCharacter_ReturnTrue() {
		UserValidator user = new UserValidator();
		boolean isPassWordValid = user.checkPassWord("Rekhajambhulkar@1");
		Assert.assertTrue(isPassWordValid);
	}

	// Test Case for Password return False
	@Test
	public void checkingPassWord_whenNoOneSpecialCharacter_ReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isPassWordInvalid = user.checkPassWord("riyajambhulkar");
		Assert.assertFalse(isPassWordInvalid);
	}
}
