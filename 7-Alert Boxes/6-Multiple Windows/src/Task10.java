import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("button1")).click();
		
		Set<String> winIds = driver.getWindowHandles();
		
		Iterator<String> it = winIds.iterator();

		String mainWindow = it.next();

		String firstWindow = it.next();

		driver.switchTo().window(firstWindow);
		
		System.out.println(driver.getTitle());

		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
