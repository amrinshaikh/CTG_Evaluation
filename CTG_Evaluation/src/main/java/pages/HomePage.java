package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;
import Utility.TestUtil;

public class HomePage extends TestBase{

	TestUtil testUtil=new TestUtil();
	//PageFactory
	
	@FindBy(xpath="//*[contains(text(),'Contacts')]")
	WebElement Contacts;
	
	@FindBy(xpath="//*[contains(text(),'Companies')]")
	WebElement Companies;
	
	public ContactsPage GoToContacts()
	{
		testUtil.flashElement(driver, Contacts);
		Contacts.click();
		return new ContactsPage();
	}

	public String verifyHomePageTitle() {
	
		return driver.getCurrentUrl();
	}
	//Actions
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
