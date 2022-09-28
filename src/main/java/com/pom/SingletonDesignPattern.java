package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingletonDesignPattern {
		public static WebDriver driver;
		
		
		public SingletonDesignPattern(WebDriver driver2) {
			this.driver= driver2;
			PageFactory.initElements(driver, this);
		}

		public SignUp_pom signUp() {
			SignUp_pom su = new SignUp_pom(driver);
			return su;
		}
		
		public UserDetails_pom userDetails() {
			UserDetails_pom ud = new UserDetails_pom(driver);
			return ud;
		}
	
}
