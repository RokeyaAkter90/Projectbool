package StepDefinitionb;

import com.bool.Actions.delhomepageactions;
import com.bool.Actions.dellprofilepageactions;
import com.bool.Actions.dellsigninpageactions;
import com.bool.Utilityb.basetest;
import com.bool.Utilityb.screenutility;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellsignin extends basetest {
	delhomepageactions Delhomepageactions = new delhomepageactions();
	dellsigninpageactions Dellsigninpageactions = new dellsigninpageactions();
	dellprofilepageactions Dellprofilepageactions = new dellprofilepageactions();
	
	@Then("^Click on dell sigininlink$")
	public void click_on_dell_sigininlink() throws Throwable {
	Delhomepageactions.dellloginlink();   
	}

	@Then("^Fill out dell signin credentials and click signin button$")
	public void fill_out_dell_signin_credentials_and_clicl_signin_buttons() throws Throwable {
		Dellsigninpageactions.filloutdellsignincredentials(propb.getProperty("Email"), propb.getProperty("Passworddell"));  
	}

	@Then("^Verify user dell signin$")
	public void verify_user_dell_signin() throws Throwable {
		Dellprofilepageactions.verifyuserdellsignin();
		screenutility.takescreenshot(driver, "Dell profile");
		
	}	
}
