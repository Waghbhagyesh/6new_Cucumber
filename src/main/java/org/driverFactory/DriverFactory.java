package org.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	public static WebDriver driver;
	public WebDriver initial(String browserName) {
		String path=System.getProperty("user.dir");
		if(browserName.equalsIgnoreCase("chrome")||browserName.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver",path+"\\Driver\\chromedriver.exe");
			 tlDriver.set(new ChromeDriver());	
		}else if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver",path+"\\Driver\\geckodriver.exe");
			 tlDriver.set(new FirefoxDriver());	
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return getDriver();

	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
