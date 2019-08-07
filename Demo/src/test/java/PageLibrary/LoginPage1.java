package PageLibrary;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import FileOperations.FileOperations;


public class LoginPage1 {
	FileOperations op = new FileOperations();
	

	WebDriver driver;

	public LoginPage1(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sendEmailAddress(String email) {
		
		driver.findElement(By.id(op.getProperty("emailId"))).sendKeys(email);
		//driver.findElement(By.id("emailId")).sendKeys(email);
	}

	public void sendPassword(String pass) {
		
		driver.findElement(By.id(op.getProperty("password"))).sendKeys(pass);
		//driver.findElement(By.id("password")).sendKeys(pass);
	}

	public void clickOnSubmitButton() {
		driver.findElement(By.xpath(op.getProperty("submit"))).click();
		//driver.findElement(By.xpath("submit")).click();
	}
	
	public void login() {
		sendEmailAddress(op.getProperty("username"));
		sendPassword(op.getProperty("password"));
		clickOnSubmitButton();
	}

}
