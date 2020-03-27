package com.adactindemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelDemo {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hotl;
	
	@FindBy(id="room_type")
	private WebElement rt;
	
	@FindBy(id="room_nos")
	private WebElement rn;
	
	@FindBy(id="adult_room")
	private WebElement adlts;
	
	@FindBy(id="child_room")
	private WebElement chilno;
	
	@FindBy(id="Submit")
	private WebElement serh;
	
	public SearchHotelDemo(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotl() {
		return hotl;
	}

	public WebElement getRt() {
		return rt;
	}

	public WebElement getRn() {
		return rn;
	}

	public WebElement getAdlts() {
		return adlts;
	}

	public WebElement getChilno() {
		return chilno;
	}

	public WebElement getSerh() {
		return serh;
	}
	
	
	}

	

	

	

	

	

