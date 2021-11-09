package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.IcustSpecificMethods;

public class IcustNewCustomerOnboarding4 extends IcustSpecificMethods{

	public IcustNewCustomerOnboarding4 selectNoOfSignatures() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding4.SignDropDown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding4.NoOfSign.Xpath")));
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding4.NoOfSign.Xpath")));
		wait(1000);
		return this;
	}
	
	public IcustNewCustomerOnboarding4 clickSignUpload() throws AWTException {
		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",
				props.getProperty("IcustNewCustomerOnboarding4.SignUpload1.Xpath"));
		action.moveToElement(chooseFile).click().perform();
		wait(2000);
		uploadFile("D:\\Pictures\\Class_2_Practise.jpeg");
		wait(3000);
		return this;
	}
	
	public IcustNewCustomerOnboarding4 clickFinishButton() {
		WebElement finishButton =locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding4.Finish.Xpath"));
		jsExecutor(finishButton);
		clickElement(finishButton);
		//clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.Finish.Xpath")));
		wait(6000);
		return this;
	}
	
	public IcustTellerDashboard clickContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding4.OnboardingContinue.Xpath")));
		wait(2000);
		//driver.switchTo().window(secondWindow);
		driver.close();
		driver.switchTo().window(firstWindow);
		wait(2000);
		return new IcustTellerDashboard();
	}
}
