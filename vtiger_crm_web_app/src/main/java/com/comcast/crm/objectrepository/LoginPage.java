package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.ActionUtility;
/**
 * @author Vijay
 * 
 * Contains Login page elements and business lib like login()
 */
public class LoginPage { // Rule-1 Create A Separate Java Class
	                     // Rule-2 Object Creation
	
	ActionUtility alib = new ActionUtility();

	 @FindBy(id="username")
	 WebElement usernameEdt;
	 
	 @FindBy(id="password")
	 WebElement passwordEdt;
	 
	 @FindBy(className ="buttonBlue")
	 WebElement loginBtn;
	 
	                    // Rule-3 Object Initialization
	 public LoginPage (WebDriver driver		) {
		 PageFactory.initElements(driver, this);
	 }

	 public WebElement getUsernameEdt() {
		 return usernameEdt;
	 }

	 public WebElement getPasswordEdt() {
		 return passwordEdt;
	 }
	 /**
	  * login to application based username , password arguments
	  * @param un
	  * @param pwd
	  */
	 
	 public void login(String un, String pwd) {
		 usernameEdt.clear();
		 passwordEdt.clear();
		 usernameEdt.sendKeys(un);
		 passwordEdt.sendKeys(pwd);
		 loginBtn.click();
	 }
}
