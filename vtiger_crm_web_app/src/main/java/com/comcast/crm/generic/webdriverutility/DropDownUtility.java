package com.comcast.crm.generic.webdriverutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class DropDownUtility {
	private Select sel;
	
	public DropDownUtility(WebElement element) {
		sel = new Select(element);
	}
	
	public void selectByVisibleTextDropDown(String text) {
		sel.selectByVisibleText(text);
	}

	public void selectByContainsVisibleTextDropDown(String text) {
		sel.selectByVisibleText(text);
	}

	public void selectByIndexDropDown(int index) {
		sel.selectByIndex(index);
	}

	public void selectByValueDropDown1(String value) {
		sel.selectByValue(value);
	}

	public void deselectByVisibleTextDropDown(String text) {
		sel.deselectByVisibleText(text);
	}

	public void deselectByContainsVisibleTextDropDown(String text) {
		sel.deSelectByContainsVisibleText(text);
	}

	public void deselectByIndexDropDown(int index) {
		sel.deselectByIndex(index);
	}

	public void deselectByValueDropDown(String text) {
		sel.deselectByValue(text);
	}

	public void getAllOptionsDropDown(WebElement element) {
		Select sel = new Select(element);
		sel.getOptions();
	}

	public void getAllSelectedOptionsDropDown() {
		sel.getAllSelectedOptions();
	}

	public void getFirstSelectedOptionDropDown() {
		sel.getFirstSelectedOption();
	}

	public void getWrappedElementDropDown() {
		sel.getWrappedElement();
	}

	public void multipleDropDown() {
		sel.isMultiple();
	}

}
