Feature: Deal Data Creation dealsmap

Scenario: Free CRM Create a new deal scenario

Given user is already on login Page for dealsmap
When title of login page is Free CRM for dealsmap
Then user enters username and password for dealsmap
| username | password | 
| batchautomation | Test@12345 |
Then user clicks on login button for dealsmap
Then user is on home page for dealsmap
Then user moves to new deal page for dealsmap
Then user enters deal details for dealsmap
| title | amount | probability | commission |
| test deal1 | 1000 | 50 | 10 | 
| test deal2 | 2000 | 50 | 20 | 
| test deal3 | 3000 | 50 | 30 | 
| test deal4 | 4000 | 50 | 40 | 
Then Close the Browser for dealsmap