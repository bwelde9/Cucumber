import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.priceline.com/");
		driver.manage().window().maximize();
		
		Select s = new Select(driver.findElement(By.id("rooms")));
		
		s.selectByIndex(2);
		s.selectByIndex(7);
		
		//Print everything from list
		List<WebElement> options = s.getOptions();
		
		System.out.println(options.size());
		
		//Select Multiple
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();

        

        Select b =new Select(driver.findElement(By.id("selenium_commands")));

        b.selectByIndex(0);

        b.selectByIndex(3);

        

        List <WebElement> allSelected= b.getAllSelectedOptions();

        for(WebElement e:allSelected) {

            System.out.println(e.getText());

        }
				
		

	}

}
