package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Utility.TestUtil;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewcontactPage;

public class NewContactTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	NewcontactPage newContactPage;
	String sheetName = "NewContact";
	
	public NewContactTest()
	{
		super();
		
	}
	   
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		newContactPage=new NewcontactPage();
		contactsPage=new ContactsPage();
	}
	
	@DataProvider
	public Object[][] getCRMTestData() throws Exception{
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String ftName, String ltName, String mdName,String comp,String e,String ctgory,String stus,String desc,String strAdr,String City,String State,String zip,String contry)
	{

newContactPage.createNewContact(ftName, ltName, mdName, comp, e, ctgory, stus, desc, strAdr, City, State, zip, contry);
//contactsPage.addNewContact();
		
	}
}
