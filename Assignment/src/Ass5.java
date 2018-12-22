

1.  XPATH is one of the Selenium locators. 
	Easy to understand and to remember but it takes time, it is a long way.
	
2.  a, by using other unique attributes 
	b, usinig contains
	c. using absolute path

3. and 4.

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ass5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("angular");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='formly_1_input_username_0']")).sendKeys("angular");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[3]/button")).click();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name=\'loginform\']/div/div[2]/input")).sendKeys("Mike");
		driver.findElement(By.xpath("//*[@id='fill_metric']/preceding::div[11]/input")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@name='proceed']")).click();
		
		driver.close();
		driver.quit();
		

	}

}
