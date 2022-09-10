package StepDefinitionb;

import com.bool.Actions.delLregisterpageactions;
import com.bool.Actions.delhomepageactions;
import com.bool.Utilityb.basetest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellsignup extends basetest {
	delhomepageactions Delhomepageactions = new delhomepageactions();
	delLregisterpageactions  DelLregisterpageactions  = new delLregisterpageactions ();
	
	@Then("^Click on siginin and createacc link$")
	public void click_on_siginin_and_createacc_link() throws Throwable {
		Delhomepageactions.dellsiginuplink();   
	}

	@Then("^Fill out dell signup credentials$")
	public void fill_out_dell_signup_credentials() throws Throwable {
	DelLregisterpageactions.Filloutdellsignupcredentials(propb.getProperty("FristName"), propb.getProperty("LastName"), propb.getProperty("Email"), propb.getProperty("Passworddell"));  
	}

	@When("^click on createaccount button$")
	public void click_on_createaccount_button() throws Throwable {
	    
	}

	@Then("^Verify UseLog user dell signup$")
	public void verify_UseLog_user_dell_signup() throws Throwable {
	 
	}	
}
