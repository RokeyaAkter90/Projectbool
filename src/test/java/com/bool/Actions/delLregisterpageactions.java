package com.bool.Actions;

import com.bool.Locators.delLregisterpagelocators;
import com.bool.Utilityb.basetest;

public class delLregisterpageactions extends basetest {
	delLregisterpagelocators DelLregisterpagelocators = new delLregisterpagelocators();
	
	public void Filloutdellsignupcredentials(String fn, String ln, String em, String depas) throws Exception {
		DelLregisterpagelocators.fname.sendKeys(fn);
		DelLregisterpagelocators.lname.sendKeys(ln);
		DelLregisterpagelocators.email.sendKeys(em);
		DelLregisterpagelocators.dellpass.sendKeys(depas);
		Thread.sleep(10000);
		DelLregisterpagelocators.createaccbuton.click();
	}
}
