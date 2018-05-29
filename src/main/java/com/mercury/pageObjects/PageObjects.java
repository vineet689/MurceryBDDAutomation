package com.mercury.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
	 public WebDriver driver;
     
	    public PageObjects(WebDriver driver) {       
	        this.driver = driver;
	    }
	    
	   public By registerLink=  By.xpath("//a[@href='mercuryregister.php']");
	   public By username = By.name("userName");
	   public By password = By.name("password");
	   public By signinButton = By.name("login");
	   public By Firstname = By.name("firstName");
	   public By Lastname = By.name("lastName");
	   public By streetadd = By.name("address1");
	   public By city = By.name("city");
	   
	   public By state = By.name("state");
	   public By country = By.name("country");
	   public By zip = By.name("postalCode");
	  
	   
	   //public By Mortgage = By.name("value(sMonthlyMortgage)");
	   //public By annualincome = By.name("value(sAnnualIncome)");
	   
	   public By emailRegistration = By.name("email");
	   public By confirmPassword = By.name("confirmPassword");
	   public By registerSubmitButton = By.id("register");
	   
	   
	   public By phonenumber = By.name("phone");
	//   public By email = By.name("userName");
//	   public By ssn = By.name("value(sSSN)");
	//   public By dob = By.name("value(sDOB)");
	   //public By mothersmaiden = By.name("value(sMaidenName)");
	   

}
