
//1. getText prints(gets) the text between  the two tags and getAttribute prints(gets) the value.
//
//2.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//public class Ass8 {
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
//		ChromeDriver driver  = new ChromeDriver();
//		
//		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
//		driver.manage().window().maximize();
//		
//		
//		driver.findElement(By.id("username")).sendKeys("angular");
//		String text=driver.findElement(By.id("username")).getAttribute("value");
//		System.out.println(text);
//		
//		driver.findElement(By.id("password")).sendKeys("password");
//		String text1=driver.findElement(By.id("password")).getAttribute("value");
//		System.out.println(text1);
//		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#//*[@id='formly_2_input_username_0']")));
//		
//		driver.findElement(By.xpath("#//*[@id='formly_2_input_username_0']")).sendKeys("angular");
//		
//		driver.findElement(By.cssSelector(".btn")).click();
//		
//		driver.findElement(By.className("ng-scope")).getText().equals("You're logged in!!");
//		
//		driver.findElement(By.cssSelector("p.ng-scope:nth-child(3) > a:nth-child(1)")).click();
//		
//		driver.close();
//		driver.quit();
//		
//		
//	}
//
//}

//3.

//public class Ass8 {
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
//		ChromeDriver driver  = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.id("email")).sendKeys("mike123@yahoo.com");
//		String text1=driver.findElement(By.id("email")).getAttribute("value");
//		System.out.println(text1);
//		
//		driver.findElement(By.id("pass")).sendKeys("mike12345");
//		String text2=driver.findElement(By.id("pass")).getAttribute("value");
//		System.out.println(text2);
//		
//		driver.close();
//		driver.quit();
//		
//		
//	}
//}

//4.

public class Ass8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String[] intArray={ "honda","toyota","ford","tesla","bmw" };
		
		for(int i=0;i<intArray.length;i++) {
			driver.findElement(By.name("q")).sendKeys(intArray[i]);
			driver.findElement(By.name("btnK")).click();
			String result=driver.findElement(By.id("resultStats")).getText();
			System.out.println(intArray[i] + "-"+ result + "found");
		}
		
		
		
	}
}
