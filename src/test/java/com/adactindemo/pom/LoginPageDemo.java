package com.adactindemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageDemo {
	
	public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement paswrd;
	
	@FindBy(id="login")
	private WebElement login;

	
	public LoginPageDemo(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	public WebElement getUser() {
		return user;
	}

	public WebElement getPaswrd() {
		return paswrd;
	}

	public WebElement getLogin() {
		return login;
	}

	
	

	}
	
	


