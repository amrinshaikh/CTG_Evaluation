package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import pages.RegistrationPage;

public class RegistrationTestcase extends TestBase{
//LoginPage loginPage;
//homePage homePage;
RegistrationPage registrationPage;

public RegistrationTestcase()
{
	super();
}

@BeforeMethod
public void setUp()
{
	initialization();
	registrationPage=new RegistrationPage();
}



@Test(priority=1)
public void RegisterUser() throws InterruptedException
{
	registrationPage.enterCred();
	registrationPage.completeReg();
}

@AfterMethod
public void tearDown()
{
	//driver.quit();
}
}
