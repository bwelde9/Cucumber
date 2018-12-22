package com.prestashop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Prestashopingpositive {
	WebDriver driver = null;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binni\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");

}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.cssSelector("#email_create")).sendKeys("kigali22@yahoo.com");
		driver.findElement(By.cssSelector("#SubmitCreate")).click();
		driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Ruwama");
		driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Rerua");
		driver.findElement(By.cssSelector("#email")).sendKeys("kigali22@yahoo.com");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("Kigatu122");
		driver.findElement(By.cssSelector("#address1")).sendKeys("123 E North");
		driver.findElement(By.cssSelector("#city")).sendKeys("Chicago");
		driver.findElement(By.cssSelector("#id_state > option:nth-child(15)")).click();
		driver.findElement(By.cssSelector("#postcode")).sendKeys("60640");
		driver.findElement(By.cssSelector("#id_country > option:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("7732134528");
		driver.findElement(By.cssSelector("#alias")).sendKeys("Lulu");
		driver.findElement(By.cssSelector("#submitAccount > span")).click();
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a")).click();
		
	}
	@Ignore
	@Test
	public void logback() {
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("kigali22@yahoo.com");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("Kigatu122");
		driver.findElement(By.cssSelector("#SubmitLogin")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a > span")),"Ruwam Reru");
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a")).click(); 
		
	}
	
	
}