package com.bool.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bool.Utilityb.basetest;

public class boolhopmepageLocators extends basetest{

public boolhopmepageLocators() {
		
	PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH, using="//a[@class='menu']")
	public WebElement menulink;
	
	@FindBy(how=How.XPATH, using="//a[text()='Services']")
	public WebElement service;
	
	@FindBy(how=How.XPATH, using="/html/body/section/header/nav[1]/ul/li[3]/ul/li[3]/a")
	public WebElement signuplink;
}
