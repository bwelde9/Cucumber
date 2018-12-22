//
//
//1. Selenium will identify elements using Selenium locators by inspecting the element and findElement method.
//
//2. driver.findElement(By.locatorStrategy("LocatorValue"));
//	driver: the driver we are going to use to identify the element.
//	findElement: it is a command takes a By. object and returns an object of WebElement.
//	By.locatorStrategy: Selenium locators use to identify the element
//	LocatorValue: the value of the selenium locator in the web
//
//3. Selenium have total 8 locators: Id, Name, Class Name, Tag Name, Link Text, Partial Link Text, Xpath, CSS.
//
//
//4.
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Ass4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.website.com/sign-in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Mike");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("signin-submit2")).click();
		 
		driver.close();
		driver.quit();
		
	}

}
