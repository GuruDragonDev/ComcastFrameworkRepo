package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.ActionUtility;

public class HomePage {
	private WebDriver driver;
	ActionUtility alib = new ActionUtility();
	
	@FindBy(partialLinkText  = "Projects")
	private WebElement projectsLink;

	@FindBy(id = "appnavigator")
	private WebElement navigatorBtn;

	@FindBy(className = "keyword-input")
	private WebElement searchtxtField;

	@FindBy(id = "menubar_quickCreate")
	private WebElement quickcreationBtn;

	@FindBy(xpath = "//button[contains(@class,'reArrangeTabs dropdown-toggle')]")
	private WebElement plusDD;

	@FindBy(xpath = "//font[contains(text(),'Add a Widget')]")
	private WebElement addAWidget;

	@FindBy(className = "addNewDashBoard")
	private WebElement addNewDashBoard;

	@FindBy(css = "a[class='reArrangeTabs']")
	private WebElement recognizeTheTabs;

	@FindBy(css = "a[title='Stain']")
	private WebElement stain;

	@FindBy(css = "a[title='Reports']")
	private WebElement reports;

	@FindBy(css = "a[title='Tasks']")
	private WebElement tasks;

	@FindBy(xpath = "//span[contains(@title,'Administrator(admin)')]")
	private WebElement admin;

	@FindBy(css = "a[title='Dashboard']")
	private WebElement dashBoard;

	@FindBy(css = "div[id='MARKETING_modules_dropdownMenu']")
	private WebElement marketing;

	@FindBy(css = "div[id='PROJECT_modules_dropdownMenu']")
	private WebElement projectsEdt;

	@FindBy(xpath = "//div[@id='PROJECT_modules_dropdownMenu']/following::ul//a[@title='Organizations']")
	private WebElement organization;

	@FindBy(xpath = "//div[@id='PROJECT_modules_dropdownMenu']/following::ul//a[@title='Contacts']")
	private WebElement contacts;

	@FindBy(className = "company-logo")
	private WebElement logo;

	@FindBy(css = "a[title='Dashboard']")
	private WebElement dashBoardLinkHMPage;

	@FindBy(xpath = "//span[contains(text(),'VTExperts Demo')]")
	private WebElement administrationIcon;

	@FindBy(xpath = "//a[contains(@id,'menubar_item_right_LBL_SIGN_OUT')]")
	private WebElement signOut;

	/**
	 * @return the navigatorBtn
	 */
	public WebElement getNavigatorBtn() {
		return navigatorBtn;
	}

	/**
	 * @return the searchtxtField
	 */
	public WebElement getSearchtxtField() {
		return searchtxtField;
	}

	/**
	 * @return the quickcreationBtn
	 */
	public WebElement getQuickcreationBtn() {
		return quickcreationBtn;
	}

	/**
	 * @return the plusDD
	 */
	public WebElement getPlusDD() {
		return plusDD;
	}

	/**
	 * @return the addAWidget
	 */
	public WebElement getAddAWidget() {
		return addAWidget;
	}

	/**
	 * @return the addNewDashBoard
	 */
	public WebElement getAddNewDashBoard() {
		return addNewDashBoard;
	}

	/**
	 * @return the recognizeTheTabs
	 */
	public WebElement getRecognizeTheTabs() {
		return recognizeTheTabs;
	}

	/**
	 * @return the stain
	 */
	public WebElement getStain() {
		return stain;
	}

	/**
	 * @return the reports
	 */
	public WebElement getReports() {
		return reports;
	}

	/**
	 * @return the tasks
	 */
	public WebElement getTasks() {
		return tasks;
	}

	/**
	 * @return the admin
	 */
	public WebElement getAdmin() {
		return admin;
	}

	/**
	 * @return the dashBoard
	 */
	public WebElement getDashBoard() {
		return dashBoard;
	}

	/**
	 * @return the marketing
	 */
	public WebElement getMarketing() {
		return marketing;
	}

	/**
	 * @return the projectsEdt
	 */
	public WebElement getProjectsEdt() {
		return projectsEdt;
	}

	/**
	 * @return the accounts
	 */
	public WebElement getOrganization() {
		return organization;
	}

	/**
	 * @return the contacts
	 */
	public WebElement getContacts() {
		return contacts;
	}

	/**
	 * @return the logo
	 */
	public WebElement getLogo() {
		return logo;
	}

	/**
	 * @return the dashBoardLinkHMPage
	 */
	public WebElement getDashBoardLinkHMPage() {
		return dashBoardLinkHMPage;
	}

	/**
	 * @return the administrationIcon
	 */
	public WebElement getAdministrationIcon() {
		return administrationIcon;
	}

	/**
	 * @return the signOut
	 */
	public WebElement getSignOut() {
		return signOut;
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void signOut() {
		alib.clickOnElement(administrationIcon);
		alib.clickOnElement(signOut);
	}

	public void clickOnOrganization() {
		alib.clickOnElement(navigatorBtn);
		alib.moveToElement(projectsEdt);
		alib.moveToElement(organization);
		alib.clickOnElement(organization);
	}

}
