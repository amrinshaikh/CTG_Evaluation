package Utility;

import java.io.File;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openxml4j.exceptions.InvalidFormatException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import BaseClass.TestBase;

public class TestUtil extends TestBase {

	public static final long PAGE_LOAD_TIMEOUT = 40;
	public static final long IMPLICIT_WAIT = 70;
	 static String currentDir = System.getProperty("user.dir");
	public static String TESTDATA_SHEET_PATH= currentDir+"/src/main/java/TestData/CRM_Testdata.xlsx";
	static WebDriver driver;
		static Sheet sheet;
	static Workbook book;
	
	//take screen shot utility
	public static void takeScreenshotOnException() throws IOException {
		// TODO Auto-generated method stub
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	
//Read Excel sheet data
	public static Object[][] getTestData(String sheetName) throws Exception {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			
			}
		}
		return data;
	}
	
	//Switch driver control to frame
	public void switchToFrame() {
		driver.switchTo().frame("downloadFrame");
	}


//Flash webelement before clicking
	public void flashElement(WebDriver driver2, WebElement element) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgColor= element.getCssValue("background-color");
		for (int i=0;i<=10;i++)
		{
			changeColor("rgb(255,255,0)",element,driver2);
			changeColor(bgColor,element,driver2);
		}
		}
	
	 public static void changeColor(String color, WebElement element, WebDriver driver) {
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

	        try {
	            Thread.sleep(20);
	        }  catch (InterruptedException e) {
	        }
	     }

}
