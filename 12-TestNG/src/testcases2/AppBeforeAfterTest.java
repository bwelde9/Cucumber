package testcases2;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppBeforeAfterTest {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before tes");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After test");
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
