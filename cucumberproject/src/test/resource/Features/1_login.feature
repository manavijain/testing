Feature: Login Feature

Scenario: Verify login is successful with valid login credentials

Given The login page is displayed

When user enters a valid username and password

When user clicks login button

Then the user is navigated to the home screen and "Products" should be displayed on homescreen