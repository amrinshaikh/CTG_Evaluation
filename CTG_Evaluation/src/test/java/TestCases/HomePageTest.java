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

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;

	public HomePageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageUrl = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageUrl, "https://ui.freecrm.com/home","Home page Url not matched");
	}
	
	@Test(priority=2)
	public void verifyContactsLinkTest(){
		
		contactsPage = homePage.GoToContacts();
	}
	
	
}
