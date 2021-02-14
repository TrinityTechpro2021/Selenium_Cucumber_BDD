Feature: Deal Data Creation

Scenario: Free CRM Create a new deal scenario

Given user is already on login Page for deals
When title of login page is Free CRM for deals
Then user enters username and password for deals
| batchautomation | Test@12345 |
Then user clicks on login button for deals
Then user is on home page for deals
Then user moves to new deal page for deals
Then user enters deal details for deals
| test deal | 1000 | 50 | 10 | 
Then Close the Browser for deals