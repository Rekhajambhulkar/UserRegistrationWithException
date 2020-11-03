package com.bridgelabz.userregistration;

public class UserRegistration {

	// Test Case for FirstName return true
	@Test
	public void checkingFirstname() {
		UserValidator validator = new UserValidator();
		boolean isFirstName = validator.checkFirstname("Rekha");
		Assert.assertTrue(isFirstName);
	}

	// Test Case for FirstName return False
	@Test
	public void checkingFirstNameInvalidReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean isFirstName = validator.checkFirstname("riya");
		Assert.assertFalse(isFirstName);
	}
}
