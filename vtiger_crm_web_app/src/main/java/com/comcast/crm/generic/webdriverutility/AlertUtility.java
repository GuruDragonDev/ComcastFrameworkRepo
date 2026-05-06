package com.comcast.crm.generic.webdriverutility;

import org.openqa.selenium.WebDriver;

public class AlertUtility {
	public void switchToAlertAndAccept(WebDriver driver) {
		  driver.switchTo().alert().accept();
	}

	public void switchToAlertAndDismiss(WebDriver driver) {
		  driver.switchTo().alert().dismiss();
	}

	public void switchToAlertAndGetText(WebDriver driver) {
		  driver.switchTo().alert().getText();
	}

	public void switchToAlertAndSendKeys(WebDriver driver, String text) {
		  driver.switchTo().alert().sendKeys(text);
	}
}
