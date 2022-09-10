package com.bool.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.bool.Locators.boolsignuppageLocators;
import com.bool.Utilityb.basetest;

public class boolsignuppageactions extends basetest{
	boolsignuppageLocators BoolsignuppageLocators  = new boolsignuppageLocators ();
	public void Filloutboolsignupcredentials (String log, String p, String cp, String n, String e) throws Exception {
		BoolsignuppageLocators.logininput.sendKeys(log);
		BoolsignuppageLocators.pass.sendKeys(p);
		BoolsignuppageLocators.confirmpass.sendKeys(cp);
		BoolsignuppageLocators.nam.sendKeys(n);
		BoolsignuppageLocators.em.sendKeys(e);
		
		
		Select dropdown = new Select (BoolsignuppageLocators.desh);
		dropdown.selectByVisibleText("United States");
		Thread.sleep(5000);
		BoolsignuppageLocators.join.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
}
