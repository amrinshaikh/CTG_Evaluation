package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.TestBase;
import Utility.TestUtil;

public class ContactsPage extends TestBase {

	TestUtil testUtil=new TestUtil();
	//PageFactory
	@FindBy(xpath="//*[contains(text(),'New')]")
	WebElement newContact;
	
	
	public ContactsPage()
	{
		//initialising page objects associated with this page
		PageFactory.initElements(driver, this);
	}
	public void addNewContact()
	{
	testUtil.flashElement(driver,newContact);
		newContact.click();
	}
}
