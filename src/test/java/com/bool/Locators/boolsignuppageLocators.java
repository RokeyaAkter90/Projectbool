package com.bool.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList;

import com.bool.Utilityb.basetest;

public class boolsignuppageLocators extends basetest {

public boolsignuppageLocators() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="Login")
	public WebElement logininput;
	
	@FindBy(how=How.ID, using="Senha")
	public WebElement pass;
	
	@FindBy(how=How.ID, using="Senha2")
	public WebElement confirmpass;
	
	@FindBy(how=How.ID, using="Nome")
	public WebElement nam;
	
	@FindBy(how=How.ID, using="email")
	public WebElement em;
	
	@FindBy(how=How.ID, using="Pais")
	public WebElement desh;
	
	@FindBy(how=How.NAME, using="enviar")
	public WebElement join;
}
