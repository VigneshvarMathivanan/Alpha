package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up Now')]")
	private WebElement signUpBtn;
	
	public SignUp_pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}
	
	

	
}
