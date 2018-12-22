package cybertek2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CNNTest {
	
	@Test
	public void navigatetocnn() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ww.cnn.com/");
		driver.close();
		driver.quit();
		
	}

}
