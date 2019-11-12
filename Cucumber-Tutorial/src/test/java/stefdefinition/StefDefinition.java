package stefdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StefDefinition {
	//regular cucumber expresion start with ^ (caret) and end with $ (dollar sign)
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {

		
		System.out.println("open login page url");
	}
	

	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	   
		System.out.println("Username and Password");
	}
	
	@When("^I submit login page$")
	public void i_submit_login_page() throws Throwable {
	    
		System.out.println("submit page");
	}
	
	@Then("^I redirect to user home page$")
	public void i_redirect_to_user_home_page() throws Throwable {
	    
		System.out.println("user home page - ok");
		
	}


}
