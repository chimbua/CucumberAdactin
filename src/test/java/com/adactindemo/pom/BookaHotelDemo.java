package com.adactindemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotelDemo {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement addr;

	@FindBy(id="cc_num")
	private WebElement cardno;
	
	@FindBy(id="cc_type")
	private WebElement cardtype; 
	
	@FindBy(id="cc_exp_month")
	private WebElement Month;
	
	@FindBy(id="cc_exp_year")
	private WebElement Year;
	
	@FindBy(id="cc_cvv")
	private WebElement ccv;

	@FindBy(id="book_now")
	private WebElement book;
	
	
	public BookaHotelDemo(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getLastname() {
		return lname;
	}


	public WebElement getAddr() {
		return addr;
	}


	public WebElement getCardno() {
		return cardno;
	}


	public WebElement getCardtype() {
		return cardtype;
	}


	public WebElement getMonth() {
		return Month;
	}


	public WebElement getYear() {
		return Year;
	}


	public WebElement getCcv() {
		return ccv;
	}


	public WebElement getBook() {
		return book;
	}
  }
	
	
	

	
	
	
	

	

	

	
	
	
	

	

