import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Task3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		String title = driver.getTitle();
		if(title.contains("Business")) {
			System.out.println("Verified");
		}else {
			System.out.println("Not-verified"); 
			
		}
		driver.close();

	}

}
