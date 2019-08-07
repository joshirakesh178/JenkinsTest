package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import FileOperations.FileOperations;

public class NaukriLogin {
	
FileOperations fp = new FileOperations();
	

	WebDriver driver;

	public NaukriLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnLogin() {
		
		driver.findElement(By.xpath(fp.getProperty("Naukri.Login"))).click();
	}
	
	public void sendUserId(String userId) {
		
		driver.findElement(By.id(fp.getProperty("Naukri.userId"))).sendKeys(userId);
	}
	
	public void sendPassword(String password) {
		
		driver.findElement(By.id(fp.getProperty("Naukri.password"))).sendKeys(password);
	}
	
	public void Login() {
		
		driver.findElement(By.xpath(fp.getProperty("Naukri.Submit"))).click();
	}
	
	public void LoginToNaukri() {
		
		clickOnLogin();
		sendUserId(fp.getProperty("NaukriUserId"));
		sendPassword(fp.getProperty("NaukriPassword"));
		Login();
	}
	
	
}
