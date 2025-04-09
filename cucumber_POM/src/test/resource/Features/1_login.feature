Feature: Login Feature

@set1
Scenario: Verify login is successful with valid login credentials

Given The login page is displayed

When user enters a valid username and password

When user clicks login button

Then the user is navigated to the home screen and "Products" should be displayed on homescreen



@set3
Scenario Outline: Login with valid and invalid login credentials

Given The login page is displayed
When User enters "<username>" and "<password>"
When User clicks on login button
Then The application should display the message "<message>"

Examples:

|	username		  | password		  |	message		   |
|	standard_user | secret_sauce  | Products		 |
|	standard_user | secret_sauce1 | Epic sadface: Username and password do not match any user in this service  |