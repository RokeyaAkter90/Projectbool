package com.bool.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bool.Utilityb.basetest;

public class dellsigninpageLocators extends basetest {

	public dellsigninpageLocators() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.ID, using="SignInModel_EmailAddress")
	public WebElement demail;
	@FindBy(how=How.ID, using="userPwd_UserInputSecret")
	public WebElement dellpass;
	@FindBy(how=How.ID, using="btnSignIn")
	public WebElement dellsigninbuton;
}
