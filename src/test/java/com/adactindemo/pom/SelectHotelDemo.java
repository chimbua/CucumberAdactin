package com.adactindemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelDemo {
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement conti;
	
	public SelectHotelDemo(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getConti() {
		return conti;
	}
		
	}


