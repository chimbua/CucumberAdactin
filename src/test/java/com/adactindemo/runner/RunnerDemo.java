package com.adactindemo.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactindemo.baseclass.BaseClass;
import com.adactindemo.helper.FileReaderManagerDemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactindemo\\feature", 
glue = "com\\adactindemo\\stepdefinition",
plugin = {"pretty","html:report","com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"},
monochrome = true, 
dryRun = false, 
strict = true)


public class RunnerDemo {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws IOException {
		String browsername = FileReaderManagerDemo.getInstance().getCrInstance().getBrowserName();
		driver = BaseClass.browserLaunch(browsername);

	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}