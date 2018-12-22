package pomdesign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.homepage;
import pages.secondPage;

public class loginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
	}
	
	@AfterTest
	public void closeUp() {

		driver.close();
		driver.quit();

	}
	@Test
	public void login() {
		homepage loginPage = new homepage(driver);
		secondPage log =new secondPage(driver);

		loginPage.username.sendKeys("Admin");
		loginPage.password.sendKeys("admin123");
		loginPage.signin.click();
		
		log.welcome.click();
		log.logout.click();
	}

}
