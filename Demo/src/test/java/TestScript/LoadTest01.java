package TestScript;

import org.testng.annotations.Test;

import PageLibrary.LoginPage;
import PageLibrary.LoginPage1;
import TestBase.TestBase;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class LoadTest01 extends TestBase {

	@BeforeClass
	public void beforeClass() throws IOException {

		init("FacebookUrl");

	}

	@Test
	public void f() {
		System.out.println("Executiong test cases in Test...");

		LoginPage1 loginPage = new LoginPage1(driver);
		loginPage.login();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
