package StepDefinitionb;

import com.bool.Actions.dellprofilepageactions;
import com.bool.Utilityb.basetest;

import cucumber.api.java.en.Then;

public class dellsignout extends basetest {
	dellprofilepageactions Dellprofilepageactions = new dellprofilepageactions();
	
	@Then("^user click singout button$")
	public void user_click_singout_button() throws Throwable {
	Dellprofilepageactions.userclicksingoutbutton();  
	}

	@Then("^Verify user dell signout$")
	public void verify_user_dell_signout() throws Throwable {
		Dellprofilepageactions.Verifyuserdellsignout();    
	}

}
