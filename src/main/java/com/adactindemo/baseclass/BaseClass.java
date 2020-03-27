package com.adactindemo.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Return;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Hp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Hp\\eclipse-workspace\\SeleniumPractice\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid Bowser");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public void clickOnWebelement(WebElement element) {
		element.click();
	}

	public static void getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
		}

	}

	public static void getCurrentUrl(String CurrentUrl) {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
		}
	}

	public static void navigateto(String Url) {
		try {
			driver.navigate().to("");
		} catch (Exception e) {
		}

	}

	public static void navigateback(String Ur) {
		try {
			driver.navigate().back();
		} catch (Exception e) {
		}

	}

	public static void navigaterefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
		}

	}

	public static void navigateforward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
		}

	}

	public static void simplealert() {
		try {
			Alert simple = driver.switchTo().alert();
			simple.accept();
		} catch (Exception e) {
		}

	}

	public static void confirmAlert() {
		try {
			Alert calert = driver.switchTo().alert();
			calert.accept();
			Alert calert1 = driver.switchTo().alert();
			calert1.dismiss();
		} catch (Exception e) {
		}

	}

	public static void promptAlert() {
		try {
			Alert palert = driver.switchTo().alert();
			palert.accept();
			Alert palert1 = driver.switchTo().alert();
			palert1.sendKeys("");
			palert1.accept();

		} catch (Exception e) {
		}

	}
		
public static void isEnabled(WebElement element) {
	try {
		element.isEnabled();
	} catch (Exception e) {
	}

	}

	public static void isDisplayed(WebElement element) {
		
		try {
			element.isDisplayed();
		} catch (Exception e) {
		}

	}
	public static void isSelected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
		}

	}
	
	public static void action(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
		
	}
	
	public static void draganddrop(WebElement drag, WebElement drop) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
	}
	
	public static void robot(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void takesscreenshot(WebElement driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Hp\\eclipse-workspace\\SeleniumConcepts\\Screenshot\\one.png");
		FileUtils.copyFile(src, des);
		
	}
	public static void frame(WebElement iframe) {
		iframe.click();
		driver.switchTo().frame(0);
	}
	public static void quit() {
		driver.quit();

	}
	 public static void close() {
		 driver.close();
	}
	
	public static void dropdownselection(WebElement element, String option,String value) {
		try {
			Select s = new Select(element);
			
			if(option.equals("index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}else if (option.equals("value")) {
				s.selectByValue(value);
			}else if (option.equals("text")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public static void windowshandling() {
		try {
			driver.getWindowHandles();
		} catch (Exception e) {
		}

	}
	
	public static void getattribute(By bySearchButton) {
		try {
			WebElement element = driver.findElement(bySearchButton);
			System.out.println(element);
		} catch (Exception e) {
		}
	}
	
	public static void implicitwait() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
		}
	}
	
	public static void explicitwait(long seconds, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
		}
	}
	public static void fluentwait() {
		try {
			FluentWait wait = new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).
					pollingEvery(10,TimeUnit.SECONDS).ignoring(Exception.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void typehere(WebElement element, CharSequence value) {
		element.sendKeys(value);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
