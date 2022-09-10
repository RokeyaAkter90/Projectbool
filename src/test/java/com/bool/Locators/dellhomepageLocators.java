package com.bool.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bool.Utilityb.basetest;

public class dellhomepageLocators extends basetest {

public dellhomepageLocators() {

	PageFactory.initElements(driver, this);
}

@FindBy(how=How.XPATH, using="//span[text()='Sign In']")
public WebElement signinlink;

@FindBy(how=How.XPATH, using="//a[text()=' Sign In ']")
public WebElement signin;

@FindBy(how=How.XPATH, using="//a[text()=' Create an account ']")
public WebElement createacclink;
	
}
