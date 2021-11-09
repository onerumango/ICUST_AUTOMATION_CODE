package pages;

import base.IcustSpecificMethods;

public class IcustTellerDashboard extends IcustSpecificMethods{

	public IcustNewCustomerOnboarding1 clickNewCustomerOnboardingLink() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.NewCustomer.Xpath")));
		windowsHandling();
		webDriverWait("New Customer Onboarding | Rumango");
		return new IcustNewCustomerOnboarding1();
	}
	
	public CustomerOnboardingTaskSummary clickCustomerOnboardingTaskSummary() {
		clickElement(locateElement("xpath", props.getProperty("CustomerOnboardingTaskSummary.SumaryIcon.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		return new CustomerOnboardingTaskSummary();
	}
}
