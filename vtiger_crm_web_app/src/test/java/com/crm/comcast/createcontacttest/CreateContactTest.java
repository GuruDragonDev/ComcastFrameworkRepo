package com.crm.comcast.createcontacttest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.comcast.crm.generic.baseclassutility.BaseClassUtility;

public class CreateContactTest extends BaseClassUtility{
	
	@Test
public void createContact() {
	System.out.println("Execute createContact ");
	
}

	@Test
public void createContactWithDate() {
	System.out.println("Execute createContactWithDate & Veify");
}

}
