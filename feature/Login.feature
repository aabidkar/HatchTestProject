Feature: Login Functionality of the HATCH application

Scenario Outline: Check Login functionality with valid user details

Given user visit the website
When user enters a Username as "<username>" and a Password as "<password>" field
And user clicks on a Login button
And user close a browser

Examples:
|username				|password	|
|orgadmin@piedmont.com	|h@tch		|