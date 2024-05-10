package com.cucumber.stepdefination;

import org.openqa.selenium.WebDriver.Navigation;

import com.cucumber.PageObjects.AdminRateContractListPageObjects;
import com.cucumber.PageObjects.AdminRegistrationPageObjects;
import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminRegistrationListSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminRegistrationPageObjects registration;

	public AdminRegistrationListSteps(TestContext context) {
		System.out.println("Started CL2plus1 Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		registration = testContext.getPageObjectManager().getregistration();
	}
	@Given("^Login valid Username and valid Password$")
	public void login_valid_Username_and_valid_Password() throws Throwable {
		login.Logintoappln("testingtest", "Admin@1");
		Thread.sleep(7000);	
		}

	@When("^Click on the Registration tab$")
	public void click_on_the_Registration_tab() throws Throwable {
		//registration.ClickontheRegistrationtab();
	}

	@Then("^enter the firstname$")
	public void enter_the_firstname() throws Throwable {
		//registration.enterthefirstname();
	}

	@Then("^enter the lastname$")
	public void enter_the_lastname() throws Throwable {
		//registration.enterthelastname();
	}

	@Then("^enter the emailid$")
	public void enter_the_emailid() throws Throwable {
		//registration.entertheemailid();
	}

	@Then("^enter the mobile number$")
	public void enter_the_mobile_number() throws Throwable {
		//registration.enterthemobilenumber();
	}

	@Then("^enter username$")
	public void enter_username() throws Throwable {
		//registration.enterusername();
	}

	@Then("^enter pwd$")
	public void enter_pwd() throws Throwable {
		registration.enterpwd();
	}

	@Then("^click on Register and ok button$")
	public void click_on_Register_and_ok_button() throws Throwable {
		//registration.clickonRegisterandokbutton();
	}

	
}