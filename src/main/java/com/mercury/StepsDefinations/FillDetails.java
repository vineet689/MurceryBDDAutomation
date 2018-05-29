package com.mercury.StepsDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import extras.Constants;
import extras.ExcelUtils;
import junit.framework.Assert;


import com.mercury.pageObjects.PageObjects;


public class FillDetails {

	public static WebDriver driver;
	ExcelUtils inputdata = new ExcelUtils();
	PageObjects po = new PageObjects(driver);
	
	

	@Given("^User is already on the credit card page$")
	public void user_on_Credit_Card_Page() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.driverPath);
		inputdata.setExcelFile(Constants.Path_TestData + Constants.File_TestData, "Cartcheckout");
		driver = new ChromeDriver();
		
		driver.get("https://creditcards.chase.com/?CELL=6TKX&jp_aid_a=66422665&jp_aid_p=homepage_carousel/slide3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

@When("^title of the page is right$")
public void check_page_title() throws Exception {
	
	String expectedTitle = "Register: Mercury Tours";
	String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	
}

@Then("^user enters all the required information$")
public void enter_all_information() throws Exception {
	driver.findElement(po.username).sendKeys("");//Need to work
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(po.password).click();
	//String windowHandleBefore = driver.getWindowHandle();
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
	Thread.sleep(2000);
	//Actions actions = new Actions(driver);
	//actions.moveToElement(driver.findElement(po.Firstname));
	//actions.click();
	//Filling all the Registration details
		driver.findElement(po.Firstname).sendKeys(inputdata.getCellData(1, 0));
				//System.out.println(inputdata.getCellData(1, 0));
				driver.findElement(po.Lastname).sendKeys(inputdata.getCellData(1, 1));
				driver.findElement(po.streetadd).sendKeys(inputdata.getCellData(1, 2));
				
				driver.findElement(po.city).sendKeys(inputdata.getCellData(1, 3));
				driver.findElement(po.state).sendKeys(inputdata.getCellData(1, 4));
				
				driver.findElement(po.zip).sendKeys(inputdata.getCellData(1, 5));
				Select drptype = new Select(driver.findElement(po.country));
				drptype.selectByValue("26");
				
			//	driver.findElement(po.annualincome).sendKeys(inputdata.getCellData(1, 6));
			//	Thread.sleep(2000);
			//	driver.findElement(po.Mortgage).sendKeys(inputdata.getCellData(1, 7));
			//	driver.findElement(po.Employer).sendKeys(inputdata.getCellData(1, 8));
				
				
				driver.findElement(po.phonenumber).sendKeys(inputdata.getCellData(1, 9));
				driver.findElement(po.emailRegistration).sendKeys(inputdata.getCellData(1, 10));
			//	driver.findElement(po.ssn).sendKeys(inputdata.getCellData(1, 11));
			//	driver.findElement(po.dob).sendKeys(inputdata.getCellData(1, 12));
			//	driver.findElement(po.mothersmaiden).sendKeys(inputdata.getCellData(1, 13));
				driver.findElement(po.registerSubmitButton).click();

				
				
}

}
