package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.TestBase;

public class NewcontactPage extends TestBase {

	
	//Factory
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="middle_name")
	WebElement middleName;
	
	@FindBy(xpath="//div[@name='company']//input[@class='search']")
	WebElement company;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement email;
	
	//dropdown list
	@FindBy(name="category")
	WebElement category;
	
	//drop downlist
	@FindBy(name="status")
	WebElement status;
	
	@FindBy(name="description")
	WebElement description;
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	WebElement streetAddress;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
    WebElement state;
	
	@FindBy(name="zip")
	WebElement ZipCode;
	
	//drop down
	@FindBy(xpath="//div[@name='country']//input[@class='search']")
	WebElement country;
	
	@FindBy(xpath="//*[contains(text(),'Save')]")
	WebElement Save;
	
	//actions
	
	public NewcontactPage()
	{
		PageFactory.initElements(driver, this);
		
	}

	public void createNewContact(String ftName, String ltName, String mdName,String comp,String e,String ctgory,String stus,String desc,String strAdr,String City,String State,String zip,String contry){
		
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		middleName.sendKeys(mdName);
		company.sendKeys(comp);
		email.sendKeys(e);
		category.click();
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		
		//Select select = new Select(category); //html tag is not select but Div hence this code not working
		//select.selectByVisibleText(ctgory);
		status.click();
		Actions keyDown2 = new Actions(driver);
		keyDown2.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		
		//Select select1 = new Select(status);
		//select1.selectByVisibleText(stus);
				
		description.sendKeys(desc);
		streetAddress.sendKeys(strAdr);
		city.sendKeys(City);
		state.sendKeys(State);
		ZipCode.sendKeys(zip);
		country.sendKeys(contry);
				Save.click();
}
}
	