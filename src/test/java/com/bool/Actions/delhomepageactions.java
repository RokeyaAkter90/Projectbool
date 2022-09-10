package com.bool.Actions;

import org.openqa.selenium.interactions.Actions;

import com.bool.Locators.dellhomepageLocators;
import com.bool.Utilityb.basetest;

public class delhomepageactions extends basetest {
	dellhomepageLocators DellhomepageLocators = new dellhomepageLocators();
	public void dellsiginuplink() throws Exception {
		Actions mouse = new Actions (driver);
        mouse.moveToElement(DellhomepageLocators.signinlink).build().perform();
        Thread.sleep(2000);
		DellhomepageLocators.createacclink.click();
		Thread.sleep(3000);
	}
public void dellloginlink() throws Exception {
	Actions mouse1 = new Actions (driver);
	mouse1.moveToElement(DellhomepageLocators.signinlink).build().perform();
    Thread.sleep(2000);
	DellhomepageLocators.signin.click();
	Thread.sleep(3000);
}
}
