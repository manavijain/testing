Feature: login Feature

@set5
Scenario Outline: Login with valid and invalid login credentials
Given The login page is displayed
When User enters "<username>" and "<password>"
Then User session should be available

Examples:

| username       | password      | message  |
| standard_user  | secret_sauce | Products |