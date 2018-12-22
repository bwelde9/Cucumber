import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
//		ChromeDriver chromeDriver  = new ChromeDriver();
//		chromeDriver.get("https://www.google.com/");
		//chromeDriver.get("https://www.amazon.com/");
		
		System.setProperty("webdriver.gecko.driver", "../geckodriver.exe"); 
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.amazon.com/");
		driver1.close();
		driver1.quit();

	}

}
