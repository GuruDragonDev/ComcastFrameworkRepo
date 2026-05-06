package com.comcast.crm.generic.baseclassutility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.comcast.crm.generic.databaseutility.DataBaseUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.LoginPage;

public class BaseClassUtility {
	public WebDriver driver = null;
	public static WebDriver sdriver;
	DataBaseUtility dblib = new DataBaseUtility();
	ExcelUtility elib = new ExcelUtility();
	FileUtility flib = new FileUtility();

	@BeforeSuite
	public void configBeforeSuite() {
		try {
			dblib.getDbconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void configLaunchBrowser() {
		String BROWSER = flib.getDataFromPropertiesFile("browser");
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		sdriver = driver;
		UtilityClassObject.setDriver(driver);
		String URL = flib.getDataFromPropertiesFile("url");
		driver.get(URL);
	}

	@BeforeMethod
	public void Login() {
		String USERNAME = flib.getDataFromPropertiesFile("un");
		String PASSWORD = flib.getDataFromPropertiesFile("pwd");
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
	}

	@AfterMethod
	public void Logout() {
		HomePage hp = new HomePage(driver);
		hp.signOut();
	}

	@AfterClass
	public void configCloseBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void configAfterSuite() {
		try {
			dblib.closeDbconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
