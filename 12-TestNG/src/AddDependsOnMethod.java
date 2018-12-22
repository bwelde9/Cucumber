
import org.testng.annotations.Test;

public class AddDependsOnMethod {

	@Test(priority=1,enabled=false)
	public void LoginTest() {
		
		System.out.println("Login");
	}
	
	@Test(priority=2,dependsOnMethods= {"LoginTest"})
	public void PasswordChange() {
		
		System.out.println("Changing Password");
}
	@Test(priority=3,dependsOnMethods= {"PasswordChange"})
	public void LogoutTest() {
		
		System.out.println("Logout");
	}
}
