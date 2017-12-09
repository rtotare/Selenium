

Feature: Login to Gmail
	

@tag1
Scenario: Login successfull
Given User open URL "https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AddSession"
And  Enter valid username "rutu1910" 
When click on "Next" button
Given Enter invalid password "12345"
When  click on "Next" Button
Then User should get error message "Wrong password. Try again or click Forgot password to reset it."


