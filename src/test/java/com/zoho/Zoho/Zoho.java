package com.zoho.Zoho;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.SingletonDesignPattern;
import com.property.ConfigurationHelper;

public class Zoho extends BaseClass{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		   String browser = ConfigurationHelper.getInstance().getBrowser();
		   driver= launchBrowser(browser);
		   SingletonDesignPattern sdp = new SingletonDesignPattern(driver);
		   
		   String url = ConfigurationHelper.getInstance().getUrl();
		   launchUrl(url);
		   
		   WebElement signUp= sdp.signUp().getSignUpBtn();
		   clickOnElement(signUp);
	      
			String mail=Xlsx_reader.particularData("Sheet1", 6, 0);
			passInput(sdp.userDetails().getMailId(), mail);
	       
	       String pass=Xlsx_reader.particularData("Sheet1", 6, 1);
		   passInput(sdp.userDetails().getPassword(), pass);
	       
	       Thread.sleep(5000);
	       WebElement button= sdp.userDetails().getCheckBox();
	       clickOnElement(button);
	       
			clickOnElement(sdp.userDetails().getSubmit());
	}

}
