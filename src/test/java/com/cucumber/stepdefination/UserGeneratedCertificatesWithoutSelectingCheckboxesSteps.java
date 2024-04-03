package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.UserGeneratedCertificatesWithoutSelectingCheckboxesPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGeneratedCertificatesWithoutSelectingCheckboxesSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGeneratedCertificatesWithoutSelectingCheckboxesPageObjects generatedcertificates;

	public UserGeneratedCertificatesWithoutSelectingCheckboxesSteps(TestContext context) {
		System.out.println("Started UserGeneratedCertificates without selecting checkboxes steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		generatedcertificates = testContext.getPageObjectManager().getgeneratedcertificates();
	}


	@Given("^login with the valid Username and valid password$")
	public void login_with_the_valid_Username_and_valid_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click on reports type$")
	public void click_on_reports_type() throws Throwable {
		generatedcertificates.Clickonreportstype();
	}

	@Then("^Click the Generated Certificates$")
	public void click_the_Generated_Certificates() throws Throwable {
		generatedcertificates.ClicktheGeneratedCertificates();
	}

	@Then("^Select the Certificate Type$")
	public void select_the_Certificate_Type() throws Throwable {
		generatedcertificates.SelecttheCertificateType();
	}

	//    @Then("^click on the Action dropdown and select the options one by one$")
	//    public void click_on_the_Action_dropdown_and_select_the_options_one_by_one() throws Throwable {
	//  	generatedcertificates.ClickontheActiondropdownandselecttheoptionsonebyone();

	@Then("^Click on the Action dropdown and select the options one by one$")
	public void click_on_the_Action_dropdown_and_select_the_options_one_by_one() throws Throwable {
		generatedcertificates.ClickontheActiondropdownandselecttheoptionsonebyone();
	}
}