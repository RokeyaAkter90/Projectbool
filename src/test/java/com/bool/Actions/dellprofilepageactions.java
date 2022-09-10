package com.bool.Actions;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.bool.Locators.dellhomepageLocators;
import com.bool.Locators.dellprofilepageLocators;
import com.bool.Utilityb.basetest;

public class dellprofilepageactions extends basetest {
	dellprofilepageLocators DellprofilepageLocator  = new dellprofilepageLocators ();
	dellhomepageLocators DellhomepageLocators = new dellhomepageLocators();
	public void verifyuserdellsignin() throws Exception {
	boolean dellprofile = DellprofilepageLocator.proname.isDisplayed();
	Assert.assertTrue(dellprofile);
	Thread.sleep(5000);
	}
	
	public void userclicksingoutbutton() throws Exception {
Thread.sleep(3000);
		Actions mouse = new Actions (driver);
        mouse.moveToElement(DellprofilepageLocator.proname).build().perform();
        Thread.sleep(5000);
		DellprofilepageLocator.signout.click();
		Thread.sleep(3000);
	}
	public void Verifyuserdellsignout() throws Exception {
		boolean signin =DellhomepageLocators.signinlink.isDisplayed();
		Assert.assertTrue(signin);
		Thread.sleep(2000);
	}
}
