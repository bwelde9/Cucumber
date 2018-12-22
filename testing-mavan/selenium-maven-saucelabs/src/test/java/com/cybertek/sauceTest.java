package com.cybertek;



import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class sauceTest {
	
	public static final String USERNAME = "binni";
	public static final String ACCESS_KEY = "2ef55e88-ab86-4040-b325-d6fa1c9ba6db";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	@Test
	public void login() throws MalformedURLException{
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 8");
		caps.setCapability("version", "56.0");
		
		RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL),caps);
		driver.get("https://www.cnn.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
