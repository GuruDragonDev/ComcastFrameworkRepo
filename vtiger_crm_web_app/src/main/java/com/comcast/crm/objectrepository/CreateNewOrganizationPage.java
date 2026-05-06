package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.webdriverutility.ActionUtility;
import net.bytebuddy.asm.Advice.This;

public class CreateNewOrganizationPage {
	ActionUtility alib = new ActionUtility();
    ExcelUtility elib = new ExcelUtility();
    WebDriver driver;
	
	@FindBy(name = "accountname")
	private WebElement organizationNameTxtField;
	
	@FindBy(xpath = "//td[contains(text(),'Assigned To')]/following::td//a[@class='select2-choice']")
	private WebElement assignedToDD;

	@FindBy(css = "button[type='submit']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[contains(@id,'s2id_autogen8_search')]")
	private WebElement searchAssignedTo;

	@FindBy(xpath = "//td[contains(text(),'Industry')]/../../../..//div[contains(@id,'id_autogen1')]")
	private WebElement selectIndustry;

	@FindBy(xpath = "//input[contains(@id,'s2id_autogen2_search')]")
	private WebElement searchIndustry;

	@FindBy(xpath = "//td[contains(text(),'Type')]/../../../..//div[contains(@id,'id_autogen5')]")
	private WebElement typeEdt;

	@FindBy(xpath = "//input[contains(@id,'s2id_autogen6_search')]")
	private WebElement searchType;

	/**
	 * @return the organizationNameTxtField
	 */
	public WebElement getOrganizationNameTxtField() {
		return organizationNameTxtField;
	}

	/**
	 * @return the assignedToDD
	 */
	public WebElement getAssignedToDD() {
		return assignedToDD;
	}

	/**
	 * @return the saveBtn
	 */
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 * @return the searchAssignedTo
	 */
	public WebElement getSearchAssignedTo() {
		return searchAssignedTo;
	}

	/**
	 * @return the selectIndustry
	 */
	public WebElement getSelectIndustry() {
		return selectIndustry;
	}

	/**
	 * @return the searchIndustry
	 */
	public WebElement getSearchIndustry() {
		return searchIndustry;
	}

	/**
	 * @return the typeEdt
	 */
	public WebElement getTypeEdt() {
		return typeEdt;
	}

	/**
	 * @return the searchType
	 */
	public WebElement getSearchType() {
		return searchType;
	}
	
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fillAllNecessartFields(String text, String text2) {
		organizationNameTxtField.sendKeys(text);
		alib.clickOnElement(assignedToDD);
		searchAssignedTo.sendKeys(text2);
	}
	
	public void industry(String text) {
		alib.clickOnElement(selectIndustry);
		searchIndustry.sendKeys(text);
	}
	
	public void type(String text) {
		alib.clickOnElement(typeEdt);
		searchType.sendKeys(text);
	}
	
	public void save() {
		alib.clickOnElement(saveBtn);
	}
}
