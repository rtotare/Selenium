package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.Webutil;
import junit.framework.Assert;
import webpages.GmailLoginPage;

public class Gmail {

	GmailLoginPage g1= new GmailLoginPage();      // creating object of gmail class which is from webpages pckg
	
	@Given("^User open URL\\(\"([^\"]*)\"\\)$")
	public void user_open_URL(String url) throws Throwable {
	  Webutil.driver.get(url);
	  	 
	  	}

	@Given("^Enter valid username \"([^\"]*)\"$")
	public void enter_valid_username(String Username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    g1.enterUserName(Username);
	}

	@When("^click on \"([^\"]*)\" button$")
	public void click_on_button(String nxtbtn) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   g1.clicknxtbtn();
	}

	@Given("^Enter invalid password \"([^\"]*)\"$")
	public void enter_invalid_password(String Password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   g1.enterpasswod(Password);
	}

	@When("^click on \"([^\"]*)\" Button$")
	public void click_on_Button(String nxtbtn) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  g1.clicknxtbtn();
	}

	@Then("^User should get error message \"([^\"]*)\"$")
	public void user_should_get_error_message(String Error) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  // g1.chkerrormsg(Error);
	   Assert.assertEquals(Error, g1.chkerrormsg());
	}

}
