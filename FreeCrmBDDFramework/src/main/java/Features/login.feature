Feature: Free CRM Login Feature

#Without Example Keyword

#Scenario: Free CRM Login Test Scenario

#Given user is already on login Page
#When title of login page is Free CRM
#Then user enters "batchautomation" and "Test@12345"
#Then user clicks on login button
#Then user is on home page
#Then Close the Browser


#With example keyword

Scenario Outline: Free CRM Login Test Scenario
Given user is already on login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the Browser

Examples: 
	| username | password |
	| batchautomation | Test@12345 |
	| naveenk | test@123 |
	| tom | test1456 |
	 
#Scenario: User is able to create new contact
#
#Given user is laready on home Page
#When User mouse over on contacts link
#Then user clicks on New Contact link
#Then user enters FirstName and LastName
#Then user clicks on save button
#Then veify new contact created
