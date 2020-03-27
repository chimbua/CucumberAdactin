Feature: Testing booking functionality on adactin application 

Scenario: user checking login functions
Given user is logging using valid credentials
When user enter valid username "chimbuarya" in the username field 
And user enter valid password "Arya2103" in the password field 
And user clicks on the login button
Then goes to landing page

Scenario: user checking search function on adactin application 
	Given the search page launched 
	When user selects the location in the location field 
	And user selects apropriate hotel in the hotel field 
	And user selects room type in the room type field 
	And user selects number of rooms needed in room field 
	And user selects number of adults in adults per room field 
	And user selects number of child in the child per room field 
	And user click on Search button 
	Then user confirms searching hotel successfuly 
	
Scenario: user checking select hotel function on adactin application 
	Given the hotel selection page launched 
	When user Selects the hotel in selection option 
	And user clicks on continue button 
	Then user confirms hotel selection successfully 
		
Scenario: user checking book hotel function on adactin application 
	Given book hotel page launched 
	When user enter first name "Chilambarasan" in the first name field 
	And user enter last name "Aravamudhu" in the last name field 
	And user enter address "Lawspet" in the address field 
	And user enter valid credit card number "12345678901" in the credit card field 
	And user selects the card type in the card type field 
	And user selects expiry month and year in the expiry date field 
	And user enter the CVV number "123" in the CVV field 
	And user click on Book now button 
	Then user confirms booking hotel successfully 
	
	
	
	
	
	
