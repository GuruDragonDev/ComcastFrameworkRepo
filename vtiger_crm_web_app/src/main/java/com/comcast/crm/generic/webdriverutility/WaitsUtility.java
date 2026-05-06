package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsUtility {
	
	private WebDriverWait wait;
	
	public WaitsUtility(WebDriver driver, int timeouts) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
	}
	
	public void visibliltyOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void elementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void elementToBeSelected(WebElement element) {
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void invisibilityOf(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void urlToBe(String text) {
		wait.until(ExpectedConditions.urlToBe(text));
	}
	
	public void titleContains(String text) {
		wait.until(ExpectedConditions.titleContains(text));
	}
	
	public void urlContains(String text) {
		wait.until(ExpectedConditions.urlContains(text));
	}

}
