package org.baseUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public Properties init_Driver() {
		Properties pro=new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("./src\\test\\resources\\org\\config\\config.properties");
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro;
		
	}

}
