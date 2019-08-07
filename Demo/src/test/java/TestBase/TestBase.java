package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import FileOperations.FileOperations;
import TestUtills.TestUtill;


public class TestBase extends TestUtill{

	public static Properties Repository = new Properties();
	public File file;
	public FileInputStream FI;
	public static WebDriver driver;
	
	
	public void init(String url) throws IOException {
		loadPropertiesFile();
		loadPropertiesFile1();
		selectBrowser(Repository.getProperty("browser"));
		driver.get(Repository.getProperty(url));
	}

	public void loadPropertiesFile() throws IOException {
		System.out.println("loading properties");
		file = new File(System.getProperty("user.dir") + "//src//test//java//ConfigProperty//Config.property");
		FI = new FileInputStream(file);
		Repository.load(FI);
		System.out.println("loading properties success");
	}
	
	public void loadPropertiesFile1() throws IOException {
		System.out.println("loading properties");		
		FileOperations.loadproperties();
		System.out.println("loading properties success");
	}

	public WebDriver selectBrowser(String browser) {
		System.out.println("loading browser");
		if (browser.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webDriver.geco.driver",
					System.getProperty("user.dir") + "//src//main//resource//Drivers//gecodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}

		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//main//resources//Drivers//chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}

		System.out.println("loading "+browser+" browser success");
		return driver;

	}
}
