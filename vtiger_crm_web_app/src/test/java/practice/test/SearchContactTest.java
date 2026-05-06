package practice.test;
/**
 * test class for Contact module
 * @author Vijay
 */

import org.testng.annotations.Test;

import com.comcast.crm.generic.baseclassutility.BaseClassUtility;
import com.comcast.crm.objectrepository.LoginPage;

public class SearchContactTest extends BaseClassUtility {
	/**
	 * Scenario : login()===> navigateContact==>createcontact()==verify
	 */
	@Test
public void searchContactTest() {
		/* Step 1: Login To Application */
	LoginPage lp = new LoginPage(driver);
	lp.login("un", "pwd");
}
}
