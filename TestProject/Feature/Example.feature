@tag
Feature: Login to gamil
	

@tag1
Scenario: Valid login
Given  Open browser and launch to gmail
When Enter valid username and password
Then User login successfull to Gamil



@tag2

Scenario: Invalid login

Given Open browser and launch to gmail
When Enter valid username and password
Then User not able to login to gmail


