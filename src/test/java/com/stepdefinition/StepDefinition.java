package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.SingletonDesignPattern;
import com.property.ConfigurationHelper;
import com.runner.Runner;
import com.zoho.Zoho.BaseClass;
import com.zoho.Zoho.Xlsx_reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	   public static WebDriver driver= Runner.driver;
	   SingletonDesignPattern sdp = new SingletonDesignPattern(driver);

	
	@Given("user Launch The Url")
	public void user_launch_the_url() throws IOException {
		String url = ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
	}
	
	@Then("user Click The Signup Button")
	public void user_click_the_signup_button() {
		   WebElement signUp= sdp.signUp().getSignUpBtn();
		clickOnElement(signUp);
	}
	

	@When("user Enter The MailId")
	public void user_enter_the_mail_id() throws IOException {
		String mail=Xlsx_reader.particularData("Sheet1", 6, 0);
		passInput(sdp.userDetails().getMailId(), mail);
	}
	
	@When("user Enter The Password")
	public void user_enter_the_password() throws IOException {
		String pass=Xlsx_reader.particularData("Sheet1", 6, 1);
		passInput(sdp.userDetails().getPassword(), pass);
	}
	
	@When("user Accept The TermsAndConditions")
	public void user_accept_the_terms_and_conditions() throws InterruptedException {
		Thread.sleep(5000);
	       WebElement button= sdp.userDetails().getCheckBox();
	       clickOnElement(button);
	}
	
	@Then("user Click The SignupForFree Button")
	public void user_click_the_signup_for_free_button() {
		clickOnElement(sdp.userDetails().getSubmit());
	}










}
