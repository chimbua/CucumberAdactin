package com.adactindemo.helper;

import org.openqa.selenium.WebDriver;

import com.adactindemo.pom.BookaHotelDemo;
import com.adactindemo.pom.LoginPageDemo;
import com.adactindemo.pom.SearchHotelDemo;
import com.adactindemo.pom.SelectHotelDemo;

public class PageObjectManagerDemo {
	
	public static WebDriver driver;
	
	public static LoginPageDemo lp;
	public static SearchHotelDemo sh;
	public static SelectHotelDemo sl;
	public static BookaHotelDemo bh;

	public PageObjectManagerDemo(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public static LoginPageDemo getLp() {
		lp=new LoginPageDemo(driver);
		return lp;
		
	}
	public static SearchHotelDemo getSh() {
		sh=new SearchHotelDemo(driver);
		return sh;

	}
	
	public static SelectHotelDemo getSl() {
		sl=new SelectHotelDemo(driver);
		return sl;

	}
	
	public static BookaHotelDemo getBh() {
		bh=new BookaHotelDemo(driver);
		return bh;

	}
	
	
}
