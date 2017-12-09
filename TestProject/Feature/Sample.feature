

Feature: Login to yahoo
	

@tag1
Scenario: Login successfull
Given User open URL "https://yahoo.com"
And  Enter valid username "rtotare" 
When click on "Next" button
Given Enter invalid password "123343434445"
Then User should login succesfully


