package testcases;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppSkipTest {
	
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
		throw new SkipException("reason");
}
	@Test(priority=3,enabled=false)
	public void LogoutTest() {
		
		System.out.println("Logout");
	}

}
