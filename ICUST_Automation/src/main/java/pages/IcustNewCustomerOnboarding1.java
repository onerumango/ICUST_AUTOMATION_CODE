package pages;
import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustNewCustomerOnboarding1 extends IcustSpecificMethods {
	
	public IcustNewCustomerOnboarding1 selectPrefix() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Prefix.Xpath")));
		return this;
	}

	public IcustNewCustomerOnboarding1 enterFirstName() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.FirstName.Xpath")), props.getProperty("FirstName"));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 enterLastName() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.LastName.Xpath")), props.getProperty("LastName"));
		return this;
	}
	public IcustNewCustomerOnboarding1 enterDateOfBirth() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.DOB.Xpath")), props.getProperty("DOB"));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 selectMaritalStatus() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.MaritalStatus.Xpath")));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 selectGender() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Gender.Xpath")));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 selectNationality() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Nationality.Xpath")));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 enterEmailAddress() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Email.Xpath")), props.getProperty("EmailAddress"));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.MobileNo.Xpath")), props.getProperty("MobileNumber"));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 enterAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Address1.Xpath")), props.getProperty("Address1"));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 enterAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Address2.Xpath")), props.getProperty("Address2"));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 enterCity() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.City.Xpath")), props.getProperty("City"));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 enterZipcode() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Zipcode.Xpath")), props.getProperty("ZipCode"));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Country.Xpath")));
		return this;
	}
	
	public IcustNewCustomerOnboarding1 selectResidence() {
		WebElement residenceType =locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown.Xpath"));
		jsExecutor(residenceType);
		clickElement(residenceType);
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Residence.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustNewCustomerOnboarding2 clickNext() {
		WebElement nextButton =locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustNewCustomerOnboarding2();
	}
}
