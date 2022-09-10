package com.bool.Actions;

import com.bool.Locators.dellsigninpageLocators;
import com.bool.Utilityb.basetest;

public class dellsigninpageactions extends basetest {
	dellsigninpageLocators DellsigninpageLocators = new dellsigninpageLocators();
	
	public void filloutdellsignincredentials(String delem, String depas) throws Exception {
		
		DellsigninpageLocators.demail.sendKeys(delem);
		Thread.sleep(2000);
		DellsigninpageLocators.dellpass.sendKeys(depas);
		Thread.sleep(10000);
		DellsigninpageLocators.dellsigninbuton.click();
		Thread.sleep(5000);
	}
}
