import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//id
		driver.findElement(By.id("login1")).sendKeys("Mike");
		
		//name
		driver.findElement(By.name("passwd")).sendKeys("abc123");
		
		//linkText
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("new account")).click();
		

	}

}
