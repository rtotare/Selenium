package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Addition {
int c;

	@Given("^user add two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_add_two_numbers_and(int a, int b) throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		c=a+b;
	}

	@Then("^addition should be \"([^\"]*)\"$")
	public void addition_should_be(int sum) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(c==sum);
	}
}