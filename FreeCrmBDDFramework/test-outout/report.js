$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Softwares/Prj/FreeCrmBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Data Creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login Page for deals",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM for deals",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password for deals",
  "rows": [
    {
      "cells": [
        "batchautomation",
        "Test@12345"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button for deals",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page for deals",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deal page for deals",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details for deals",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Close the Browser for deals",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 3459981300,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.tile_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 14188700,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 137496400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1237698200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 4962500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 1179434200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 1592965900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.Close_Browser()"
});
formatter.result({
  "duration": 670383600,
  "status": "passed"
});
});