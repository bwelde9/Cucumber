package testcases;

import org.testng.annotations.Test;

public class AppPriority {
	
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
