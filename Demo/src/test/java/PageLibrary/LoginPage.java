package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By emailId = By.id("email");
	By password = By.id("pass");
	By submit = By.xpath("//input[@value='Log In']");

	public void sendEmailAddress(String email) {

		driver.findElement(emailId).sendKeys(email);
	}

	public void sendPassword(String pass) {

		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnSubmitButton() {
		driver.findElement(submit).click();
	}
	
	public void login() {
		sendEmailAddress("9036524372");
		sendPassword("T@@fan178");
		clickOnSubmitButton();
	}

}
