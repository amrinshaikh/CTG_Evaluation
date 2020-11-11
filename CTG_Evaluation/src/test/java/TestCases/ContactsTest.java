package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Utility.TestUtil;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;

public class ContactsTest extends TestBase
{
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	LoginPage loginPage;
	
	public ContactsTest()
	{
		super();
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		
		
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		//TestUtil.runTimeInfo("error", "login successful");
		//testUtil.switchToFrame();
		//contactsPage = homePage.GoToContacts();
	}
	
	
	public void clickOnContactBtn()
	{
		contactsPage=homePage.GoToContacts();
		
	}
	
	@Test(priority=1)
	public void clickOnAddNewContacts()
	{
		contactsPage.addNewContact();
	}
	
	
	/*
	 * @AfterClass public void tearDown(){ driver.quit(); }
	 */
}
