

//1. CSS is one of the 8 Selenium locator which is short and easy to use than xpath.
//
//2.
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class Ass6 {
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
//	ChromeDriver driver  = new ChromeDriver();
//		
//		driver.get("https://login.salesforce.com/");
//		driver.manage().window().maximize();
//	
//		driver.findElement(By.cssSelector("#username")).sendKeys("Mike");
//		driver.findElement(By.cssSelector("#password")).sendKeys("abc123");
//
//		driver.findElement(By.cssSelector("#Login")).click();
//		driver.close();
//
//	}
//
//}
//
//3.

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ass6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://bestbuy.com/sign");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#profileMenuWrap1")).click();
		
		driver.findElement(By.cssSelector(".cia-form.cia-sign-on-form>div>input")).sendKeys("mike@mike.com");
		driver.findElement(By.cssSelector(".relative-wrap div>input")).sendKeys("abc123");
		driver.findElement(By.cssSelector(".cia-form__submit-button.js-submit-button")).click();
		
		driver.close();
		driver.quit();
		
		
	}
}


