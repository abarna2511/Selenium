package testng;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void login() {
		System.out.println("Login");		
	}
	
	@Test(dependsOnMethods = "login")
	public void homePage() {
		System.out.println("Home Page");		
	}
	
	@Test(dependsOnMethods = "homePage")
	public void Search() {
		System.out.println("Search Page");		
	}

}
