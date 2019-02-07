$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality of the HATCH application",
  "description": "",
  "id": "login-functionality-of-the-hatch-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Check Login functionality with valid user details",
  "description": "",
  "id": "login-functionality-of-the-hatch-application;check-login-functionality-with-valid-user-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user visit the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters a Username as \"\u003cusername\u003e\" and a Password as \"\u003cpassword\u003e\" field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on a Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user close a browser",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-functionality-of-the-hatch-application;check-login-functionality-with-valid-user-details;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "login-functionality-of-the-hatch-application;check-login-functionality-with-valid-user-details;;1"
    },
    {
      "cells": [
        "orgadmin@piedmont.com",
        "h@tch"
      ],
      "line": 12,
      "id": "login-functionality-of-the-hatch-application;check-login-functionality-with-valid-user-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Check Login functionality with valid user details",
  "description": "",
  "id": "login-functionality-of-the-hatch-application;check-login-functionality-with-valid-user-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user visit the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters a Username as \"orgadmin@piedmont.com\" and a Password as \"h@tch\" field",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on a Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user close a browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_visit_the_website()"
});
formatter.result({
  "duration": 11446488012,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "orgadmin@piedmont.com",
      "offset": 27
    },
    {
      "val": "h@tch",
      "offset": 69
    }
  ],
  "location": "Login.user_enters_a_Username_and_a_Password(String,String)"
});
formatter.result({
  "duration": 142893300,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_a_Login_button()"
});
formatter.result({
  "duration": 54865329,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_close_a_browser()"
});
formatter.result({
  "duration": 68778258,
  "status": "passed"
});
});