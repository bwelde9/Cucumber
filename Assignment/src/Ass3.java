import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bankofamerica.com/");
		driver.get("http://www.fanniemae.com/portal/index.html");
		driver.get("https://www.bcbs.com/");
		driver.get("https://www.ibm.com/us-en/?lnk=m");
		driver.get("https://www.mcdonalds.com/us/en-us.html");
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().back();
		
		System.out.println("This is my company: " + driver.getCurrentUrl());
		
		driver.close();
		driver.quit();

	}

}
