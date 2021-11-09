package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.IcustSpecificMethods;

public class IcustNewCustomerOnboarding3 extends IcustSpecificMethods {

	public IcustNewCustomerOnboarding3 selectEmploymentType() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.EmploymentType.Xpath")));
		return this;
	}

	public IcustNewCustomerOnboarding3 selectEmployerName() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.EmployerName.Xpath")));
		wait(1000);
		return this;
	}

	public IcustNewCustomerOnboarding3 enterSalary() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.Salary.Xpath")),
				props.getProperty("Salary"));
		wait(1000);
		return this;
	}

	public IcustNewCustomerOnboarding3 selectDocumentType() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding.Dopdown1.Xpath")));
		wait(6000);
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.DocumentType.Xpath")));
		wait(6000);
		return this;
	}

	public IcustNewCustomerOnboarding3 selectDocumentName() throws IOException, AWTException {

		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",
				props.getProperty("IcustNewCustomerOnboarding3.BrowseLink.XPath"));
		action.moveToElement(chooseFile).click().perform();
		wait(2000);
		uploadFile("D:\\Pictures\\Class_1.jpeg");
		wait(3000);
		return this;
	}

	public IcustNewCustomerOnboarding4 clickOtherInfmNext() {
		WebElement nextButton = locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding3.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return new IcustNewCustomerOnboarding4();
	}
}
