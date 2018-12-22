import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("login1")).sendKeys("user");
		driver.findElement(By.name("proceed")).click();
		
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.accept();
		
		driver.switchTo().defaultContent();
		driver.quit();
		
	}

}
