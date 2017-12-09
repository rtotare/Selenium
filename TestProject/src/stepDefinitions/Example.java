package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example {

	@Given("^Open browser and launch to gmail$")
	public void open_browser_and_launch_to_gmail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Launch gmail"); 
	}

	@When("^Enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
	    System.out.println("Enter valid username password");
	    
	}

	@Then("^User login successfull to Gamil$")
	public void user_login_successfull_to_Gamil() throws Throwable {
	    System.out.println("Login succesfull");
	    
	}

	@Then("^User not able to login to gmail$")
	public void user_not_able_to_login_to_gmail() throws Throwable {
		 System.out.println("Login unsuccesfull");
	    
	}


	
	
}
