package com.comcast.crm.generic.webdriverutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicActionsUtility {
	
	private WebDriver driver;
 public BasicActionsUtility() {
   	this.driver=driver;
}
	/* PAGE Navigation Actions */
	
	public void navigateTo(String text) {
		driver.navigate().to(text);
	}
	
	public void navigateBack() {
          driver.navigate().back();		
	}
	
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	public void navigateForward() {
		driver.navigate().forward();
	}
	
	/* Browser Actions */
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void minimizeWindow() {
		driver.manage().window().minimize();
	}
	
	public void minimizeFullScreen() {
		driver.manage().window().fullscreen();;
	}
	
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
}
