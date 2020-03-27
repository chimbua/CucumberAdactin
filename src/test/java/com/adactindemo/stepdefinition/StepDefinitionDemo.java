package com.adactindemo.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactindemo.baseclass.BaseClass;
import com.adactindemo.helper.FileReaderManagerDemo;
import com.adactindemo.helper.PageObjectManagerDemo;
import com.adactindemo.runner.RunnerDemo;

import cucumber.api.java.en.*;
import cucumber.api.java.en.When;

public class StepDefinitionDemo extends BaseClass {
	public static WebDriver driver = RunnerDemo.driver;

	public static PageObjectManagerDemo pom = new PageObjectManagerDemo(driver);

	@Given("user is logging using valid credentials")
	public void user_is_logging_using_valid_credentials() throws IOException, InterruptedException {
		String Url = FileReaderManagerDemo.getInstance().getCrInstance().getUrl();
	      getUrl(Url);
	      Thread.sleep(5000);
	}

	@When("^user enter valid username {string} in the username field$")
	public void user_enter_valid_username_in_the_username_field(String string) {
		typehere(pom.getLp().getUser(), string);
	}

	@When("^user enter valid password {string} in the password field$")
	public void user_enter_valid_password_in_the_password_field(String string) {
		typehere(pom.getLp().getPaswrd(), string);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		clickOnWebelement(pom.getLp().getLogin());
	}

	@Then("goes to landing page")
	public void goes_to_landing_page() {
	   
	}

	@Given("the search page launched")
	public void the_search_page_launched() {
	   System.out.println("The search page is launched");
	}

	@When("user selects the location in the location field")
	public void user_selects_the_location_in_the_location_field() {
		dropdownselection(pom.getSh().getLoc(), "value", "Sydney");
	}

	@When("user selects apropriate hotel in the hotel field")
	public void user_selects_apropriate_hotel_in_the_hotel_field() {
		 dropdownselection(pom.getSh().getHotl(), "value", "Hotel Creek");
	}

	@When("user selects room type in the room type field")
	public void user_selects_room_type_in_the_room_type_field() {
		dropdownselection(pom.getSh().getRt(), "value", "Standard");
	}

	@When("user selects number of rooms needed in room field")
	public void user_selects_number_of_rooms_needed_in_room_field() {
		dropdownselection(pom.getSh().getRn(), "value", "1");
	}

	@When("user selects number of adults in adults per room field")
	public void user_selects_number_of_adults_in_adults_per_room_field() {
		dropdownselection(pom.getSh().getAdlts(), "value", "1");
	}

	@When("user selects number of child in the child per room field")
	public void user_selects_number_of_child_in_the_child_per_room_field() {
	     dropdownselection(pom.getSh().getChilno(), "value", "1");
	}

	@When("user click on Search button")
	public void user_click_on_Search_button() {
		clickOnWebelement(pom.getSh().getSerh());
	}

	@Then("user confirms searching hotel successfuly")
	public void user_confirms_searching_hotel_successfuly() {
	     	}

	@Given("the hotel selection page launched")
	public void the_hotel_selection_page_launched() {

	}

	@When("user Selects the hotel in selection option")
	public void user_Selects_the_hotel_in_selection_option() {
		clickOnWebelement(pom.getSl().getRadio());
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
	     clickOnWebelement(pom.getSl().getConti());
	}

	@Then("user confirms hotel selection successfully")
	public void user_confirms_hotel_selection_successfully() {

	}

	@Given("book hotel page launched")
	public void book_hotel_page_launched() {

	}

	@When("user enter first name {string} in the first name field")
	public void user_enter_first_name_in_the_first_name_field(String string) {
	     typehere(pom.getBh().getFname(), string);
	}

	@When("user enter last name {string} in the last name field")
	public void user_enter_last_name_in_the_last_name_field(String string) {
	     typehere(pom.getBh().getLastname(), string);
	}

	@When("user enter address {string} in the address field")
	public void user_enter_address_in_the_address_field(String string) {
		typehere(pom.getBh().getAddr(), string);
	}

	@When("user enter valid credit card number {string} in the credit card field")
	public void user_enter_valid_credit_card_number_in_the_credit_card_field(String string) {
		typehere(pom.getBh().getCardno(), string);
	}

	@When("user selects the card type in the card type field")
	public void user_selects_the_card_type_in_the_card_type_field() {
		  dropdownselection(pom.getBh().getCardtype(), "value", "VISA");
	}

	@When("user selects expiry month and year in the expiry date field")
	public void user_selects_expiry_month_and_year_in_the_expiry_date_field() {
	     dropdownselection(pom.getBh().getMonth(), "value", "1");
	     dropdownselection(pom.getBh().getYear(), "value", "2022");
	}

	@When("user enter the CVV number {string} in the CVV field")
	public void user_enter_the_CVV_number_in_the_CVV_field(String string) {
	     typehere(pom.getBh().getCcv(), string);
	}

	@When("user click on Book now button")
	public void user_click_on_Book_now_button() {
		clickOnWebelement(pom.getBh().getBook());
	}

	@Then("user confirms booking hotel successfully")
	public void user_confirms_booking_hotel_successfully() {

	}




	}

	
