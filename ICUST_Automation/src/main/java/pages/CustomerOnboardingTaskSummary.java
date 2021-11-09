package pages;

import base.IcustSpecificMethods;

public class CustomerOnboardingTaskSummary extends IcustSpecificMethods{
	
	public CustomerOnboardingTaskSummary searchCustomerId() {
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("CustomerOnboardingTaskSummary.SumaryIcon.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("CustomerOnboardingTaskSummary.Search.Xpath")), props.getProperty("CustomerOnboardingTaskSummary.SearchCustomerID"));
		wait(10000);
		return this;
	} 

	public CustomerOnboardingTaskSummary clickCustomerId() {
		clickElement(locateElement("xpath", props.getProperty("CustomerOnboardingTaskSummary.CustomerIdClick")));
		wait(2000);
		return this;
	} 
	
	public CustomerOnboardingTaskSummary clickApprove() {
		clickElement(locateElement("xpath", props.getProperty("CustomerOnboardingTaskSummary.Approve")));
		wait(2000);
		return this;
	} 
}
