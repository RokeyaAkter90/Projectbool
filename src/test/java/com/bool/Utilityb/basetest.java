package com.bool.Utilityb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class basetest {
public static Properties propb;
public static WebDriver driver;
	
public basetest() {
		propb = new Properties();
		try {
			FileInputStream fls= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\bool\\Configureb\\Configureb.properties");
			propb.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	
	}
	public void initBrowserbool () {
		
		
		String browserset = propb.getProperty("Browser1");
		if (browserset.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\WebDriverbool\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get("https://www.dell.com/en-us");
			driver.manage().timeouts().pageLoadTimeout(testdatawait.pageLoadTimeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(testdatawait.implicitlyWait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		
		else if (browserset.equals("FF"));
		
	}
	public static void getURLbool(String URL) {
		driver.get(propb.getProperty("URL"));
		
	}
	
}
