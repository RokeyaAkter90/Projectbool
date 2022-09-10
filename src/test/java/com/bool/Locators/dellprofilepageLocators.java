package com.bool.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bool.Utilityb.basetest;

public class dellprofilepageLocators extends basetest {

	public dellprofilepageLocators() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.ID, using="um-si-label")
	public WebElement proname;
	
	@FindBy(how=How.XPATH, using="//a[text()=' Sign Out ']")
	public WebElement signout;
	
}
