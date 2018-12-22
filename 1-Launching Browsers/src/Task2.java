import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.dice.com/");
		driver.get("https://www.indeed.com/");
		
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title); 
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().forward();
		String title1 = driver.getTitle();
		System.out.println(title1); 
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		driver.close();
		driver.quit();
	}

}
