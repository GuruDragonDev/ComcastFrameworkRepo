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
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.objectrepository.HomePage;
import com.comcast.crm.objectrepository.LoginPage;

public class BaseClassTest {
	DataBaseUtility dbLib = new DataBaseUtility();
	FileUtility fLib =  new FileUtility();
	WebDriver driver = null;
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void configBS() {
		System.out.println(" ===== Connect To DB , Report Config ===== ");
		try {
			dbLib.getDbconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 	
	
	@BeforeClass
	public void configBC() {
		System.out.println("===== Launch The Browser ===== ");
		String BROWSER = fLib.getDataFromPropertiesFile("browser");
		// To Launch Browser
	    if("chrome".contains(BROWSER)) {
	    	driver = new ChromeDriver();
	    }
	    else if ("firefox".contains(BROWSER)) {
	    	driver = new FirefoxDriver();
	    }
	    else if ("edge".contains(BROWSER)) {
	    	driver = new EdgeDriver();
	    }
	    else {
	    	driver = new ChromeDriver();
	    }
		
	}
	
	
	@BeforeMethod
	public void configBM() {
		System.out.println(" ===== Login ===== ");
		String URL = fLib.getDataFromPropertiesFile("url");
		String USERNAME = fLib.getDataFromPropertiesFile("username");
		String PASSWORD = fLib.getDataFromPropertiesFile("password");
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
	}
	
	@AfterMethod 
	public void configAM() {
		System.out.println(" ===== Logout ===== ");
		HomePage hp = new HomePage(driver);
		hp.signOut();
	}

	@AfterClass
	public void configAC() {
		System.out.println(" ===== Close The Browser ===== ");
	}

	@AfterSuite
	public void configAS() {
		System.out.println(" ===== Disconnect The DB , Backup Report Config ===== ");
		try {
			dbLib.closeDbconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
