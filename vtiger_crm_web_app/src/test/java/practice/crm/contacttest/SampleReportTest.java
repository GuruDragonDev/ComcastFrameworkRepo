package practice.crm.contacttest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test ;
	@BeforeSuite
	public void configBS() {
		// Spark Report Config
		spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM Test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);
		
		// Add Environment Information And Create Test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "CHROME-100");
	}
	@AfterSuite
	public void configAS() {
		report.flush();
	}
@Test
public void createContactTest() {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://ninjacrm.com/kataria/index.php");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	String filePath = ts.getScreenshotAs(OutputType.BASE64);
	
	test = report.createTest("createContactTest");
	
	test.log(Status.INFO, "Login To App");
	test.log(Status.INFO, "Navigate To Contact Page");
	test.log(Status.INFO, "Create Contact");
	
	if("HDFDC".equals("HDFC")) {
		test.log(Status.PASS, "Contact Is Created");
	}
	else {
		test.addScreenCaptureFromBase64String(filePath, "ErrorFile");
	}
	driver.quit();
}
//@Test
//public void createContactWithOrgNameTest() {
//	
//	test = report.createTest("createContactWithOrgNameTest");
//	
//	test.log(Status.INFO, "Login To App");
//	test.log(Status.INFO, "Navigate To Contact Page");
//	test.log(Status.INFO, "Create Contact With Org Name");
//	
//	if("HDFC".equals("HDFC")) {
//		test.log(Status.PASS, "Contact Is Created");
//	}
//	else {
//		test.log(Status.FAIL, "Contact Is Not Cretated");
//	}
//}
//@Test
//public void createContactWithPhoneNumberTest() {
//	
//	test = report.createTest("createContactWithPhoneNumberTest");
//	
//	test.log(Status.INFO, "Login To App");
//	test.log(Status.INFO, "Navigate To Contact Page");
//	test.log(Status.INFO, "Create Contact With Phone Number");
//	
//	if("HDFC".equals("HDFC")) {
//		test.log(Status.PASS, "Contact Is Created");
//	}
//	else {
//		test.log(Status.FAIL, "Contact Is Not Cretated");
//	}
//}
}
