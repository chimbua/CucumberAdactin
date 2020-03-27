package com.adactindemo.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReaderDemo {
	
	public static Properties p;
	
	public ConfigurationReaderDemo() throws IOException {
		File f = new File("C:\\Users\\Hp\\eclipse-workspace\\CucumberAdactinDemo\\src\\test\\java\\com\\adactindemo\\properties\\ConfigurationDemo.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
		
	}
	public  String getBrowserName() {
		String browsername = p.getProperty("browsername");
		return browsername;

	}
	public  String getUrl() {
		String url = p.getProperty("url");
		return url;

	}
}
