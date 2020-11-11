package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;
import Utility.TestUtil;

public class LoginPage extends TestBase{

	TestUtil testUtil=new TestUtil();
	//Page Factory
	
	@FindBy(xpath="//*[contains(text(),'Log In')]")
	WebElement logInBtn;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	WebElement logIn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public String goToLoginPage()
	{
		testUtil.flashElement(driver, logInBtn);
		logInBtn.click();
		return driver.getTitle();
	}
	
	public HomePage login(String e, String passwd)
	{
	
		email.sendKeys(e);
		pwd.sendKeys(passwd);
	
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", logIn);
		    		return new HomePage();
	}
}

