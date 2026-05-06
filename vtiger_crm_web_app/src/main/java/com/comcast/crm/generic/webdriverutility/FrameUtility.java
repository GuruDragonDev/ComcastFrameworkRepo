package com.comcast.crm.generic.webdriverutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameUtility {
	public void switchToFrame(WebDriver driver, String nameID) {
		  driver.switchTo().frame(nameID);
	}

	public void switchToFrame(WebDriver driver,  int index) {
		  driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		  driver.switchTo().frame(element);
	}
	
	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
}
