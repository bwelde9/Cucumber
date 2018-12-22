
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
//		ChromeDriver chromeDriver  = new ChromeDriver();
//		chromeDriver.get("https://www.amazon.com/");
//		
//		chromeDriver.close();
//		chromeDriver.quit();
		
		
		System.setProperty("webdriver.gecko.driver", "../geckodriver.exe"); 
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.bestbuy.com/");
		driver1.manage().window().maximize();
		System.out.println("Home page Title :" + driver1.getTitle());
		
	}

}
