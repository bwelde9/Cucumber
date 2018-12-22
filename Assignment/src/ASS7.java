

//1. Some times it takes time to the element to be visible or to be clickable because of these and 

//	others we need to use implicit or explicit wait.  
//	
//2. Implicit wait and explicit wait, we use implicit once, it affects every line of the code and 
//	we use explicit depends on the condition as many as we want with different timeout.  
//
//3.

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ASS7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#post-body-7708391096228750161 > button:nth-child(2)")));
		
		driver.findElement(By.cssSelector("#post-body-7708391096228750161 > button:nth-child(2)")).click();
	
		
//		WebDriverWait wait1 = new WebDriverWait(driver, 6);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//*[@id='demo']")));
		String text =driver.findElement(By.xpath("//*[@id='demo']")).getText();
		System.out.println(text);
		
		driver.close();
		driver.quit();
	}

}
