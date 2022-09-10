package com.bool.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bool.Utilityb.basetest;

public class delLregisterpagelocators extends basetest {

	public delLregisterpagelocators() {
	
	PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="FirstName")
	public WebElement fname;

	@FindBy(how=How.ID, using="LastName")
	public WebElement lname;
	
	@FindBy(how=How.ID, using="EmailAddress")
	public WebElement email;
	@FindBy(how=How.NAME, using="userPwd_UserInputSecret")
	public WebElement dellpass;
	@FindBy(how=How.ID, using="btnCreateAccount")
	public WebElement createaccbuton;
	
	
}
