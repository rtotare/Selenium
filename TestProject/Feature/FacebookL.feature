
@tag
Feature: Login to facebook
	

@tag1
Scenario: Successfull login to facebook
  Given open URL"https://www.facebook.com/" 
	And Username "rutu1910@gmail.com"
	And password "1234"
	When Click on "Log In"
  Then validate error"The password that you've entered is incorrect." message

