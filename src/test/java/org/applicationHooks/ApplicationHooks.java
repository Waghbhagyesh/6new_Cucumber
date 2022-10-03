package org.applicationHooks;

import java.util.Properties;

import org.baseUtility.ConfigReader;
import org.driverFactory.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;



public class ApplicationHooks {
    public static WebDriver driver;
	@Before
	public void initialisation()
	{
		ConfigReader cr=new ConfigReader();
		Properties prop=cr.init_Driver();
		DriverFactory df=new DriverFactory();
		df.initial(prop.getProperty("browserName"));
	}

	@After
	public void end() {
		System.out.println("Colmpleted");
	}
}
