package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.property.ConfigurationHelper;
import com.zoho.Zoho.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//feature//Zoho.feature",glue="com.stepdefinition",monochrome=true,plugin="html:Dracarys/Zoho.html")

public class Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException {
		   String browser = ConfigurationHelper.getInstance().getBrowser();
		   driver= BaseClass.launchBrowser(browser);
	}
	
	@AfterClass
	public static void tearDown() {
	BaseClass.closeBrowser();
	}

}
