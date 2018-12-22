package com.zoho;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zohoTest {

	
	WebDriver driver = null;
	WebDriverWait wait = null;
	String path = "C:\\Users\\binni\\Desktop\\Selenium\\testing-mavan\\selenium-maven-zoho\\src\\test\\resources\\config.properties";
	String excelPath = "/Users/binni/Desktop/testData.xlsx";
	Properties prop;
	Logger log = LogManager.getLogger(zohoTest.class.getName());
	Xls_Reader data2 = new Xls_Reader(excelPath);
	
	@BeforeTest
	public void setUp() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		FileInputStream ip = new FileInputStream(path);
		prop = new Properties();
		prop.load(ip);
		
		driver.get(prop.getProperty("url"));
		
		
	}
	@AfterTest
	public void closeUp() {
		driver.quit();
	}
	@Test
	public void printExcel() {
		
		Select s = new Select(driver.findElement(By.id("recPerPage")));
		s.selectByIndex(3);
		wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#reportTab>tbody>:nth-child(20)")));
		
		List<WebElement> rows = driver.findElements(By.cssSelector("#reportTab>tbody tr"));
		List<WebElement> col= driver.findElements(By.cssSelector("#reportTab>tbody>:nth-child(3) td"));
		
		List<WebElement> id = driver.findElements(By.cssSelector("#reportTab>tbody>tr>:nth-child(1)"));
		List<WebElement> name = driver.findElements(By.cssSelector("#reportTab>tbody>tr>:nth-child(2)"));
		List<WebElement> email = driver.findElements(By.cssSelector("#reportTab>tbody>tr>:nth-child(3)"));
		List<WebElement> phone = driver.findElements(By.cssSelector("#reportTab>tbody>tr>:nth-child(4)"));
		List<WebElement> salary = driver.findElements(By.cssSelector("#reportTab>tbody>tr>:nth-child(5)"));
		
		for(int i=0; i<=rows.size();i++) {
			
			data2.setCellData("data2","ID",i+2,(id.get(i).getText()));
			log.debug("Writing Employee ID-" + (id.get(i).getText()));
			
			data2.setCellData("data2","NAME",i+2,(name.get(i).getText()));
			log.debug("Writing Employee NAME-" + (name.get(i).getText()));
			
			data2.setCellData("data2","EMAIL",i+2,(email.get(i).getText()));
			log.debug("Writing Employee EMAIL-" + (email.get(i).getText()));
			
			data2.setCellData("data2","PHONE",i+2,(phone.get(i).getText()));
			log.debug("Writing Employee PHONE-" + (phone.get(i).getText()));
			
			data2.setCellData("data2","SALARY",i+2,(salary.get(i).getText()));
			log.debug("Writing Employee SALARY-" + (salary.get(i).getText()));
			
			
		}
		
		
		
	}
	
}
