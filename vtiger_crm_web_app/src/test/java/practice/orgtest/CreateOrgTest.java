package practice.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.comcast.crm.objectrepository.LoginPage;

public class CreateOrgTest {
@Test
public void createOrgTest() throws Throwable {
	// To Read Common-Data From Properties File
    FileInputStream fis = new FileInputStream("./testdata/commonData.properties");
    Properties p = new Properties();
    p.load(fis);
    String URL = p.getProperty("url");
    String UN = p.getProperty("un");
    String PWD = p.getProperty("pwd");
    String BROWSER = p.getProperty("browser");
    
    // Generate Random Number
    Random random = new Random();
    int randomInt = random.nextInt(1000);
    
    // To Read TestScriptData From Excel File
    FileInputStream eFis = new FileInputStream("./testdata/testscripts1.xlsx");
    Workbook wb = WorkbookFactory.create(eFis);
    String orgName = wb.getSheet("CreateOrg").getRow(1).getCell(2).getStringCellValue()+randomInt;
    wb.close();
    
    WebDriver driver = null;
    
    
    
    driver.get(URL);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
   LoginPage lp = PageFactory.initElements(driver, LoginPage.class); 
   
   
    
   WebElement un = driver.findElement(By.id("username"));
   un.clear();
    un.sendKeys(UN);
    WebElement pwd = driver.findElement(By.id("password"));
    pwd.clear();
    pwd.sendKeys(PWD);
    driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
}
}
