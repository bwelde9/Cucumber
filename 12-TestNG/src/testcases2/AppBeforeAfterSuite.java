package testcases2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppBeforeAfterSuite {
	
	@BeforeSuite
	public void beforeTest() {
		System.out.println("---Before Suit--");
	}
	@AfterSuite
	public void AfterTest() {
		System.out.println("-----After Suit--");
	}
	
	@Test(priority=1)
	public void LoginTest() {
		
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void PasswordChange() {
		
		System.out.println("Changing Password");
}
	@Test(priority=3)
	public void LogoutTest() {
		
		System.out.println("Logout");
	}

}
