package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class secondPage {
	public secondPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	
	@FindBy(css="#branding > a:nth-child(1) > img:nth-child(1)")
	public WebElement title;
	
	@FindBy(css=".menu > ul:nth-child(1)")
	public WebElement sutitle;
	@FindBy(css="#welcome")
	public WebElement welcome;
	
	@FindBy(css="#welcome-menu > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
	public WebElement logout;
	
	
	
}
