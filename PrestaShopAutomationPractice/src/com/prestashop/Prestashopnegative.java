package com.prestashop;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prestashopnegative {
	WebDriver driver = null;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binni\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();

}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
}
	@Test
	public void wrongemail() {
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("nigatu@yahoo.com");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("Abujafar123");
		driver.findElement(By.cssSelector("#SubmitLogin")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).isDisplayed(),"Yes");
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a")).click();
	}
	@Test
	public void invalidemail() {
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("nigatuyahoo.com");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("Abujafar123");
		driver.findElement(By.cssSelector("#SubmitLogin")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).isDisplayed(),"Yes");
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a")).click();
	}
	
	@Test
	public void blankemail() {
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys(" ");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("Abujafar123");
		driver.findElement(By.cssSelector("#SubmitLogin")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).isDisplayed(),"Yes");
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a")).click();
	}
	
	@Test
	public void blankpasword() {
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("nigatu@yahoo.com");
		driver.findElement(By.cssSelector("#passwd")).sendKeys(" ");
		driver.findElement(By.cssSelector("#SubmitLogin")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).isDisplayed(),"Yes");
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a")).click();
	}
	
	
	
	
}