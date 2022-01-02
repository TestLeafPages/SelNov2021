Feature: Login functionality of leaftaps application

#Background:
#Given Open the chrome browser
#And Load the application url

@Functional @Smoke
Scenario Outline: TC001_Login successfully 
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


@Functional
Scenario: TC002_Login with invalid credential
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on login button
But Error message should be displayed