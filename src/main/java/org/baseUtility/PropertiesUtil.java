package org.baseUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	public static PropertiesUtil pu=new PropertiesUtil();
	public String getDataConfig(String key) {
			Properties prop=new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/org/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
            
	}
            
            
            
}
