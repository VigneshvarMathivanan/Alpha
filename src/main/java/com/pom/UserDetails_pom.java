package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetails_pom {
		
	public static WebDriver driver;
	
	@FindBy(id="emailfield")
	private WebElement mailId;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="signup-termservice")
	private WebElement checkBox;
	
	@FindBy(id="signupbtn")
	private WebElement submit ;
	
	
	public UserDetails_pom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMailId() {
		return mailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
