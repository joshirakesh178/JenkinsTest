package TestScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
//	@BeforeSuite
//	@AfterSuite
//	@BeforeClass
//	@AfterClass	
//	@BeforeTest
//	@AfterTest
//	@BeforeGroups
//	@AfterGroups
//	@BeforeMethod
//	@AfterMethod
//	@DataProvider
//	@Factory
//	@Listeners
//	@Parameters
//	@Test
	
	
	@BeforeSuite
	public void A() {
		
		System.out.println("@BeforeSuite");
		
	}
	@AfterSuite
	public void B() {
		
		System.out.println("@AfterSuite");
		
	}
	@BeforeClass
	public void C() {
		
		System.out.println("@BeforeClass");
		
	}
	@AfterClass
	public void D() {
		
		System.out.println("@AfterClass");
		
	}
	@BeforeTest
	public void E() {
		
		System.out.println("@BeforeTest");
		
	}
	@AfterTest
	public void F() {
		
		System.out.println("@AfterTest");
		
	}
	@BeforeGroups
	public void G() {
		
		System.out.println("@BeforeGroups");
		
	}
	@AfterGroups
	public void H() {
		
		System.out.println("@AfterGroups");
		
	}
	@BeforeMethod
	public void I() {
	
		System.out.println("@BeforeMethod");
		
	}
	@AfterMethod
	public void J() {
		
		System.out.println("@AfterMethod");
	
	}
	
	@Test
	public void Test() {
		System.out.println("Test");
	}
}
