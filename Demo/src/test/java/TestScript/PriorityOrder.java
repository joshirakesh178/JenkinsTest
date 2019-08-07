package TestScript;

import org.testng.annotations.Test;

public class PriorityOrder {
	
	@Test(priority=3)
	public void A() {
		System.out.println("A");
	}
	
	@Test(priority=2)
	public void a() {
		System.out.println("a");
	}
	
	@Test(priority=1)
	public void D() {
		
		System.out.println("D");
	}
	
	@Test
	public void C() {
		
		System.out.println("C");
	}
	
	@Test
	public void B() {
		
		System.out.println("B");
	}
	
	@Test(priority=4,enabled= false)
	public void E() {
		
		System.out.println("E");
	}
	
	@Test(priority=5,dependsOnMethods = {"B"})
	public void F() {
		
		System.out.println("F");
	}
	
//	@Test(priority=6,dependsOnMethods = {"E"},alwaysRun=true)
//	public void G() {
//		
//		System.out.println("G");
//	}
	
	
}
