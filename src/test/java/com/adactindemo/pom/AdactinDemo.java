package com.adactindemo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("chimbuarya");
		WebElement paswrd = driver.findElement(By.id("password"));
		paswrd.sendKeys("Arya2103");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement loc = driver.findElement(By.xpath("//*[@id=\"location\"]/option[3]"));
		loc.click();
		WebElement hotl = driver.findElement(By.xpath("//*[@id=\"hotels\"]/option[2]"));
		hotl.click();
		WebElement rt = driver.findElement(By.xpath("//*[@id=\"room_type\"]/option[3]"));
		rt.click();
		WebElement rn = driver.findElement(By.xpath("//*[@id=\"room_nos\"]/option[2]"));
		rn.click();
		WebElement ckindt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		ckindt.sendKeys("12/03/2020");
		WebElement ckotdt = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		ckotdt.sendKeys("13/03/2020");
		WebElement adlts = driver.findElement(By.xpath("//*[@id=\"adult_room\"]/option[2]"));
		adlts.click();
		WebElement chilno = driver.findElement(By.xpath("//*[@id=\"child_room\"]/option[2]"));
		chilno.click();
		WebElement serh = driver.findElement(By.xpath("//input[@type='submit']"));
		serh.click();
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Chilambarasan");   
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("A");
		WebElement addr = driver.findElement(By.id("address"));
		addr.sendKeys("Pondicherry");
		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys("1234567890213456");
		WebElement cardtype = driver.findElement(By.xpath("//*[@id=\"cc_type\"]/option[3]"));
		cardtype.click();
		Thread.sleep(2000);
		WebElement Month = driver.findElement(By.id("cc_exp_month"));
		Select m = new Select(Month);
		m.selectByValue("3");
		WebElement Year = driver.findElement(By.id("cc_exp_year"));
		Select y = new Select(Year);
		y.selectByValue("2022");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("635");
		Thread.sleep(2000);
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		WebElement log = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]"));
		log.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
