package pages;

import base.IcustSpecificMethods;

public class IcustNewCustomerOnboarding2 extends IcustSpecificMethods{

	public IcustNewCustomerOnboarding2 enterPasspotNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding2.PassportNumber.Xpath")), props.getProperty("PassportNumber"));
		wait(1000);
		return this;
	}
	
	public IcustNewCustomerOnboarding2 selectIssueDate() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding2.IssueDate.Xpath")), props.getProperty("PassportIssueDate"));
		wait(1000);
		return this;
	}
	
	public IcustNewCustomerOnboarding1 selectExpiryDate() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding2.ExpiryDate.Xpath")), props.getProperty("PassportExpiryDate"));
		wait(1000);
		return new IcustNewCustomerOnboarding1();
	}
}
