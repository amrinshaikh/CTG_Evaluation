package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class RegistrationPage extends TestBase{

	//Page Factory
	@FindBy(xpath="//a[contains(text(),'register')]")
	WebElement RegisterLink;
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="PASSWORD")
	WebElement pwd;
	
	@FindBy(xpath="//button[contains(text(),'Create account')]")
	WebElement submitBtn;
	
	@FindBy(xpath="//*[contains(text(),'Click to verify')]")
	WebElement confirmReg;
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterCred() throws InterruptedException
	{
		RegisterLink.click();
		firstName.click();
		firstName.sendKeys("Amrin");
		lastName.click();
		lastName.sendKeys("Shaikh");
	email.click();
		email.sendKeys("amrin.shaikh86@gmai.com");
		pwd.click();
		pwd.sendKeys("aisa20202");
		Thread.sleep(1000);
		submitBtn.sendKeys(Keys.ENTER);
	
	}

	public void completeReg()
	{
 confirmReg.click();	
	}
}
