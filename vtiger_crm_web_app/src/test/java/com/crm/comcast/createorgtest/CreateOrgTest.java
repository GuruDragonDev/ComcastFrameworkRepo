package com.crm.comcast.createorgtest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.baseclassutility.BaseClassUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.listenerimplimantationclassutility.ListenerImplimantationClassUtility;
import com.comcast.crm.generic.webdriverutility.ActionUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepository.CreateNewOrganizationPage;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.OrganizationInfoPage;

/**
 * @author Vijay
 */
@Listeners(com.comcast.crm.generic.listenerimplimantationclassutility.ListenerImplimantationClassUtility.class)
public class CreateOrgTest extends BaseClassUtility{	
	WebDriver driver;
		HomePage hp = new HomePage(driver);
		OrganizationInfoPage oIp = new OrganizationInfoPage();
		CreateNewOrganizationPage cNOP = new CreateNewOrganizationPage(driver);
		ExcelUtility elib = new ExcelUtility();
		ActionUtility alib = new ActionUtility();
		JavaUtility ju = new JavaUtility();
		
		
		@Test
	public void createOrgTest() {
		/* Click On Organizatioon Link/Button */
		UtilityClassObject.getTest().log(Status.INFO, "Navigate To Org Page");
		hp.clickOnOrganization();
		/* Read Data From Excel File */
		UtilityClassObject.getTest().log(Status.INFO, "Read Data From Excel");
		String orgName = elib.getDataFromExcelFile("CreateOrg", 1, 2)+"_"+ju.getRandomNumber();
		String txt2 = elib.getDataFromExcelFile("CreateOrg", 1, 3);
		UtilityClassObject.getTest().log(Status.INFO, "Fill All Mandatory Fields");
		/* Fill All Necessary Details/Mandatory Fields After Reading The Data From Excel File */
		cNOP.fillAllNecessartFields(orgName, txt2);
		/* Save The rganizatin */
		ListenerImplimantationClassUtility.test.log(Status.INFO, orgName + "Create A New Org");
		cNOP.save();
		/* Verify The Haeder Msg Expected Result And Org Info In Organization Info Page */
//		OrganizationInfoPage oIP = new OrganizationInfoPage();
//		String headerInfo = oIP.getExpOrgName().getText();
//		String actrgName = oIP.getActorgName().getText();
//	    SoftAssert sa = new SoftAssert();
//	    Assert.assertEquals(headerInfo, orgName);
	}

//		@Test
//	public void createOrgWithIndustryTest() {
//		//System.out.println("Execute createOrgWithIndustry & Veify");
//	}

	}
