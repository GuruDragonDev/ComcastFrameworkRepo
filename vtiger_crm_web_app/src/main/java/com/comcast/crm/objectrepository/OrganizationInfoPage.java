package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationInfoPage {
	@FindBy(xpath = "//h4[contains(text(),'Organization Details')]")
	private WebElement organizationDetails;

	@FindBy(css = "a[title='hi']")
	private WebElement actorgName;

	@FindBy(xpath = "//td[@id='Accounts_detailView_fieldValue_accountname']") 
	private WebElement expOrgName;
	
	/**
	 * @return the organizationDetails
	 */
	public WebElement getOrganizationDetails() {
		return organizationDetails;
	}

	/**
	 * @return the actorgName
	 */
	public WebElement getActorgName() {
		return actorgName;
	}

	/**
	 * @return the expOrgName
	 */
	public WebElement getExpOrgName() {
		return expOrgName;
	}

}
