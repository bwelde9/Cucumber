import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieManagement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com");
		driver.manage().window().maximize();

		Set<Cookie> ck = driver.manage().getCookies();
		for(Cookie cookie:ck) {
			System.out.println(cookie.getName() + "|"+ cookie.getValue());
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("_cb_svref");
		
		driver.close();
		driver.quit();
	}

}
