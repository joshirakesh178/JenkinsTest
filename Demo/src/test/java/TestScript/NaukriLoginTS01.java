package TestScript;

import org.testng.annotations.Test;

import PageLibrary.NaukriLogin;
import TestBase.TestBase;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import org.testng.annotations.AfterClass;

public class NaukriLoginTS01 extends TestBase {

	@BeforeClass
	public void beforeClass() throws IOException {

		init("NaukariUrl");

	}

	@Test
	public void f() {
		
		NaukriLogin nl = new NaukriLogin(driver);
		nl.LoginToNaukri();
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

}
