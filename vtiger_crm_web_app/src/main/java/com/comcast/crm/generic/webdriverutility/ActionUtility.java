package com.comcast.crm.generic.webdriverutility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility {
private Actions act;
	public void ActionUtility(WebDriver driver) {
		act = new Actions(driver);
	}
	
	public void clickOnElement(WebElement element) {
		act.click(element).perform();
	}
	
	public void doubleClick(WebElement element) {
		act.doubleClick(element).perform();
	}

	public void clickAndHold(WebElement element) {
		act.clickAndHold(element).perform();
	}

	public void contextClick(WebElement element) {
		act.contextClick(element).perform();
	}

	public void moveToElement(WebElement element) {
		act.moveToElement(element).perform();
	}

	public void moveToElement(WebElement element, int x, int y) {
		act.moveToElement(element, x, y).perform();
	}

	public void dragAndDrop( WebElement element1, WebElement element2) {
    	act.dragAndDrop(element1, element2).perform();
	}

	public void dragAndDrop(WebElement element1, int x, int y) {
		act.dragAndDropBy(element1, x, y).perform();
	}

	public void scrollByAmount( int x, int y) {
		act.scrollByAmount(x, y).perform();
	}

	public void scrollToElement( WebElement element) {
		act.scrollToElement(element).perform();
	}

	public void pressKeyDown(Keys modifierKey) {
		act.keyDown(modifierKey).perform();
	}

	public void pressKeyDown(WebElement element, Keys modifierKey) {
		act.keyDown(element, modifierKey).perform();
	}

	public void pressKeyUp(Keys modifierKey) {
		act.keyDown(modifierKey).perform();
	}

	public void pressKeyUp(WebElement element, Keys modifierKey) {
		act.keyDown(element, modifierKey).perform();
	}

	public void withoutDragAndDrop(WebElement element1, WebElement element2) {
		act.clickAndHold(element1).moveToElement(element2).release().build().perform();
	}

	public void pressKeyDownOnElement(WebElement element, Keys modifierKey, String text) {
		act.keyDown(element, modifierKey)
		.sendKeys(text)
		.keyUp(modifierKey)
		.perform();
	}

	public void copyPaste(WebElement element1, WebElement element2) {
		act.click(element1)
		.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL)
		.click(element2)
		.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		.perform();
	}

	public void holdAndType(WebElement element, Keys modifierKey, String text) {
		act.keyDown(element, modifierKey)
		.sendKeys(text)
		.keyUp(modifierKey)
		.perform();
	}

	public void releaseMouse() {
		act.release().perform();
	}
	
	public void clickOnElement1(WebElement element) {
		act.click(element).perform();
	}
	
	public void clickMoveToElementAgainClick(WebElement element, WebElement element1) {

		act.click(element).moveToElement(element1).click().perform();
	}

	public void holdModifierAndType( WebElement element, Keys modifierKey, String text) {
		act.keyDown(element, modifierKey).sendKeys(text).keyUp(modifierKey).perform();
	}

	public void typeInUpperCase( WebElement element, Keys modifierKey, String text) {

		act.keyDown(element, modifierKey)
		.sendKeys(element, text)
		.keyUp(element, modifierKey)
		.build()
		.perform();
	}

}
