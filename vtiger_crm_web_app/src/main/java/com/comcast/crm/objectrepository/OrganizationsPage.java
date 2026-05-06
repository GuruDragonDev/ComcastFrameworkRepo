package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.ActionUtility;

public class OrganizationsPage {
	WebElement element;
	ActionUtility alib = new ActionUtility();

	
@FindBy(xpath = "//h4[contains(text(),'Organizations')]")
private WebElement titleLink;

@FindBy(id = "Accounts_listView_basicAction_LBL_ADD_RECORD")
private WebElement addOnOrganizationBtn;

/**
 * @return the element
 */
public WebElement getElement() {
	return element;
}

/**
 * @return the wLib
 */
public ActionUtility getwLib() {
	return alib;
}

/**
 * @return the titleLink
 */
public WebElement getTitleLink() {
	return titleLink;
}

/**
 * @return the addOnOrganizationBtn
 */
public WebElement getAddOnOrganizationBtn() {
	return addOnOrganizationBtn;
}

public OrganizationsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void orgName(String orgName) {
	addOnOrganizationBtn.click();
}
}
