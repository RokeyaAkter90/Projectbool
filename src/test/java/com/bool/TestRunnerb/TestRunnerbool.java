package com.bool.TestRunnerb;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.bool.Utilityb.basetest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"scr/test/resources/Featuresb"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefinitionb",tags= {"@ras"})


public class TestRunnerbool extends AbstractTestNGCucumberTests {
	
    @BeforeTest
    public void openURL () {
    basetest test= new basetest();
	test.initBrowserbool();
	 }
		
	@AfterTest
	public void closeURL () {
	basetest test= new basetest();
	test.driver.quit();
	 }
}
