package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

import com.junituserregistration.UserValidator;

public class UserRegistration {

	Scanner scanner = new Scanner(System.in);
	UserValidator user;

	    @Before
	    public void setUp() throws Exception {
	        user = new UserValidator();
	    }

	    @Test
	    public void givenFirstName_whenInProperFormat_shouldReturnTrue() throws Exception {
	        boolean result = user.checkFirstName("Rekha", " ");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_whenLengthLessThan3_shouldReturnFalse() throws Exception {
	        boolean result = user.checkFirstName("Re", "Name length is less than minimum character");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenFirstName_whenNumberCome_shouldReturnFalse() throws Exception {
	        boolean result = user.checkFirstName("Re12dp", "Numeric not required in name");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenFirstName_whenSpecialSymbolCome_shouldReturnFalse() throws Exception {
	        boolean result = user.checkFirstName("Re@dp", "Special character not required in name");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenFirstName_whenNotStartWithUpperCase_shouldReturnFalse() throws Exception {
	        boolean result = user.checkFirstName("rekha", "Name first letter need uppercase");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenLastName_whenInProperFormat_shouldReturnTrue() throws Exception {
	        boolean result = user.checkLastName("Jambhulkar", " ");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenLastName_whenLengthLessThan3_shouldReturnFalse() throws Exception {
	        boolean result = user.checkLastName("Ja", "Name length is less than minimum character");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenLastName_whenNumberCome_shouldReturnFalse() throws Exception {
	        boolean result = user.checkLastName("Ja123", "Numeric not required in name");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenLastName_whenSpecialSymbolCome_shouldReturnFalse() throws Exception {
	        boolean result = user.checkLastName("Re@kha", "Special character not required in name");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenLastName_whenNotStartWithUpperCase_shouldReturnFalse() throws Exception {
	        boolean result = user.checkLastName("jambhulkar", "Name first letter need uppercase");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenMobile_whenNotCompleteDigit_shouldReturnFalse() throws Exception {
	        boolean result = user.validMobileNumber("9139124143","Country code not present");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenMobile_whenAlphabetCome_returnFalse() throws Exception {
	        boolean result = user.validMobileNumber("ASD1234592","Alphabet not required in mobile number");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenEmail_whenInGeneralFormatWithCountryCode_shouldReturnTrue() throws Exception  {
	        boolean result = user.validMobileNumber("91-9139124143"," ");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenEmail_whenNotCompleteDigit_shouldReturnFalse() throws Exception  {
	        boolean result = user.validMobileNumber("91-98224356","Incomplete Digit");
	        Assert.assertEquals(false, result);
	    }
	    @Test
	    public void givenPassword_whenMeetAllRules_returnTrue() throws Exception{
	        boolean result = user.validPassword("Rekha@1994"," ");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenPassword_whenMissingMinimumCharacter_returnFalse() throws Exception {
	        boolean result = user.validPassword("Rekha@1","Minimum 8 character required");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenPassword_whenMissingOneUpperLetterAtLeast_returnFalse() throws Exception {
	        boolean result = user.validPassword("rekha@1994","at least one uppercase required");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenPassword_whenMissingOneLowerLetterAtLeast_returnFalse() throws Exception{
	        boolean result = user.validPassword("REKHA@1994","at least one lower case required");
	        Assert.assertEquals(false, result);
	    }

	    @Test
	    public void givenPassword_whenMissingOneSpecialSymbolAtLeast_returnFalse() throws Exception {
	        boolean result = user.validPassword("Rekha1996","at least one special symbol required");
	        Assert.assertEquals(false, result);
	    }
}

