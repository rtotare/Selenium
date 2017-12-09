package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.Webutil;
import webpages.Facebook_login;
import webpages.GmailLoginPage;

public class FacebookL {
	
	Facebook_login f1= new Facebook_login();
	@Given("^open URL\"([^\"]*)\"$")
	public void open_URL(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Webutil.driver.get(url);
	}

	@Given("^Username \"([^\"]*)\"$")
	public void username(String Username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // f1.enterUserName(Username);
	}

	@Given("^password \"([^\"]*)\"$")
	public void password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//f1.enterFBpassword(password);
	} 
	

	@When("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //f1.
	}

	@Then("^validate error\"([^\"]*)\" message$")
	public void validate_error_message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
