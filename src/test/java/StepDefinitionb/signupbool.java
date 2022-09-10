package StepDefinitionb;

import com.bool.Actions.boolhomepageactions;
import com.bool.Actions.boolsignuppageactions;
import com.bool.Utilityb.basetest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signupbool extends basetest {
	boolhomepageactions Boolhomepageactions = new boolhomepageactions();
	boolsignuppageactions Boolsignuppageactions = new boolsignuppageactions();
	
	@Given("^Launch bool \"([^\"]*)\"$")
	public void launch_bool(String URL) throws Throwable {
	 getURLbool(URL);
	}

	@Then("^Click on menu and service and signup link$")
	public void click_on_menu_and_service_and_signup_link() throws Throwable {
		Boolhomepageactions.clicksignuplink();   
	}

	@Then("^Fill out bool signup credentials$")
	public void fill_out_bool_signup_credentials() throws Throwable {
		Boolsignuppageactions.Filloutboolsignupcredentials(propb.getProperty("Login"),"123456789", "123456789", propb.getProperty("Name"), propb.getProperty("Email"));
	}

	@When("^click on Joinbutton$")
	public void click_on_Joinbutton() throws Throwable {
	    
	}

	@Then("^Verify UseLog user bool signup$")
	public void verify_UseLog_user_bool_signup() throws Throwable {
	    
	}

}
