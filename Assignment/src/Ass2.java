import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://shop.honda.com/");
		
		String hondaTitle = driver.getTitle();
		
		driver.get("https://www.shop.ferrari.com/");
		String ferrariTitle = driver.getTitle();
		
		System.out.println(ferrariTitle + " has more comfort than " + hondaTitle +  " Shop for Ferrari");

		driver.close();
		driver.quit();
	}

}
