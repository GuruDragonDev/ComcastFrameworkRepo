package com.comcast.crm.generic.webdriverutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {
	private JavascriptExecutor js;

	public JavaScriptUtility(WebDriver driver) {
       js = (JavascriptExecutor)driver;
	}
	
	public void click(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}
	
	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void scrollBy(int x, int y) {
		js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x,y);
	}
	
	public String getTitle() {
		return js.executeScript("return document.title;").toString();
	}
	
	public void fillDiabledTextField(WebElement element, String value) {
		js.executeScript("arguments[0].value=arguments[1];",element, value);
	}
	
	public void setValueInDiabledTextField(WebElement element, String value) {
		js.executeScript("arguments[0].removeAttribute('disabled');"+"arguments[0].value=arguments[1];",element, value);
	}
	
}
