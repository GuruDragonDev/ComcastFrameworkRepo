package com.comcast.crm.generic.webdriverutility;

import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;

public class WindowUtility {
	private Set<String> set;
	
	
	public void switchByURL(WebDriver driver, String partialURL) {
		set = driver.getWindowHandles();
	    Iterator<String> it = set.iterator();
	    
	    while(it.hasNext()){
	  	 String windowID = it.next(); 
	  	 driver.switchTo().window(windowID);
	  	 
	  	 @Nullable
			String actURL = driver.getCurrentUrl();
	  	 if(actURL.contains(partialURL)) {
	  		 break;
	  	 }
	    }
	}
	
	
	/*public void switchByTittle(WebDriver driver, String title ) {
		for( String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
			if(driver.getTitle().contains(title)) break;
		}
	}
	
	
	public void switchByURL(WebDriver driver, String url ) {
		for( String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
			if(driver.getCurrentUrl().contains(url)) break;
		}
	}
	*/

	public void switchByTitle(WebDriver driver, String partialTitle) {
	    set = driver.getWindowHandles();
	    Iterator<String> it = set.iterator();
	    
	    while(it.hasNext()){
	  	 String windowID = it.next(); 
	  	 driver.switchTo().window(windowID);
	  	 
	  	 @Nullable
			String actTitle = driver.getCurrentUrl();
	  	 if(actTitle.contains(partialTitle)) {
	  		 break;
	  	 }
	    }
	}
}
