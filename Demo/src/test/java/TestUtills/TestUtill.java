package TestUtills;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import TestBase.TestBase;

public class TestUtill {
	
	WebDriver driver;

//	public TestUtill(WebDriver driver) {
//		this.driver = driver;
//	}
	
	public void switchToParentWindow() {
		
		Set<String> multipleWindows = driver.getWindowHandles();
		Iterator<String> iterator = multipleWindows.iterator();
		String parantWindow = iterator.next();
		String wasteWindow = "null";
		
		while(iterator.hasNext()) {
			wasteWindow = iterator.next();
			
			if(!wasteWindow.contains(parantWindow)) {
				
				driver.switchTo().window(wasteWindow);
				driver.close();
			}
		}
	}

}
