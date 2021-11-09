package pages;

import base.IcustSpecificMethods;

public class IcustTellerLogin extends IcustSpecificMethods{

	public IcustTellerLogin enterUsername() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoginPage.UserId.Xpath")), props.getProperty("username"));
		return this;
	}
	
	public IcustTellerLogin enterPassword() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoginPage.Password.Xpath")), props.getProperty("password"));
		return this;
	}
	
	public IcustTellerDashboard clickSignInButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoginPage.SignInButton.Xpath")));
		webDriverWait("Rumango");
		wait(15000);
		return new IcustTellerDashboard();
	}
}
