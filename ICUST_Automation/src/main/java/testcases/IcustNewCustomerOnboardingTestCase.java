package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustNewCustomerOnboarding3;
import pages.IcustTellerLogin;

public class IcustNewCustomerOnboardingTestCase extends IcustSpecificMethods{

	@Test
	public void runNewCustomer() throws IOException, AWTException {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickNewCustomerOnboardingLink()
		.selectPrefix()
		.enterFirstName()
		.enterLastName()
		.enterDateOfBirth()
		.selectMaritalStatus()
		.selectGender()
		.selectNationality()
		.enterEmailAddress()
		.enterMobileNumber()
		.enterAddress1()
		.enterAddress2()
		.enterCity()
		.enterZipcode()
		.selectCountry()
		.selectResidence()
		.clickNext()
		.enterPasspotNumber()
		.selectIssueDate()
		.selectExpiryDate()
		.clickNext();
		IcustNewCustomerOnboarding3 onboard = new IcustNewCustomerOnboarding3();
		onboard.selectEmploymentType()
		.selectEmployerName()
		.enterSalary()
		.selectDocumentType()
		.selectDocumentName()
		.clickOtherInfmNext()
		.selectNoOfSignatures()
		.clickSignUpload()
		.clickFinishButton()
		.clickContinue()
		.clickCustomerOnboardingTaskSummary()
		.searchCustomerId()
		.clickCustomerId()
		.clickApprove();
	}
}
