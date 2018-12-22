import org.openqa.selenium.chrome.ChromeDriver;

public class Ass9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("//forms.zohopublic.com/murodil/report/Applicants/reportperma/DibkrcDh27GWoPQ9krhiTdlSN4_34rKc8ngubKgIMy8");
		driver.manage().window().maximize();

	}

}
