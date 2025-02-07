package com.dice;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ExcelTask{

	WebDriver driver;

 

	@BeforeTest

  public void beforeTest() {

	  WebDriverManager.chromedriver().setup();

		driver=(WebDriver) new ChromeDriver();

		driver.get("https://www.dice.com/");

		driver.manage().window().maximize();

  }

  

  @Test(priority=1)

	public void getTitle() {

		String title=driver.getTitle();

		Assert.assertEquals(title,"Find Jobs in Tech | Dice.com");

		

	}

  @Test(priority=2,dataProvider="getData")

  public void SendKeys(String jobtitle, String location)  {

	 

	

	  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.id("search-field-keyword")).sendKeys(jobtitle);

		driver.findElement(By.id("search-field-location")).clear();

		driver.findElement(By.id("search-field-location")).sendKeys(location);

		driver.findElement(By.id("findTechJobs")).click();

		String countText= driver.findElement(By.id("posiCountId")).getText();

		int count = Integer.parseInt(countText.replaceAll(",", ""));

		try {

			Assert.assertTrue(count>1000);

		}catch(Throwable e) {

			System.out.println(e);

		}

		driver.navigate().back();

	  

  }



  @AfterTest

  public void afterTest() {

	    driver.close();

		driver.quit();

  }

  

  @DataProvider

  public static Object[][] getData() throws Exception {

	  File data1=new File("/Users/binni/Desktop/testData.xlsx");

	  FileInputStream fls=new FileInputStream(data1);

	  XSSFWorkbook wb=new XSSFWorkbook(fls);

	  XSSFSheet sheet1= wb.getSheetAt(0);

	   Object[][] data=new Object[4][2];

	for(int i=0; i<4; i++) {

		  for(int j=0; j<2; j++) {

			  data[i][j]=sheet1.getRow(i).getCell(j).getStringCellValue();

	 }

	  }

	return data;

	  }

}

