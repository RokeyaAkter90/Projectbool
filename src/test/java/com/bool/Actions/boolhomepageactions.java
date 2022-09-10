package com.bool.Actions;

import com.bool.Locators.boolhopmepageLocators;
import com.bool.Utilityb.basetest;

public class boolhomepageactions extends basetest {
	boolhopmepageLocators BoolhopmepageLocators = new boolhopmepageLocators();
	 public void clicksignuplink() throws Exception {
		 BoolhopmepageLocators.menulink.click();
		 BoolhopmepageLocators.service.click();
		 Thread.sleep(3000);
		 BoolhopmepageLocators.signuplink.click();
		 Thread.sleep(3000);
	 }
	
	
}
