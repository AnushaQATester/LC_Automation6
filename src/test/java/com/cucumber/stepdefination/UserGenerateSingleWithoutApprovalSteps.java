package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateSingleWithoutApprovalPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateSingleWithoutApprovalSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenerateSingleWithoutApprovalPageObjects usergeneratesinglewithoutapproval;

	public UserGenerateSingleWithoutApprovalSteps(TestContext context) {
		System.out.println("Started GenerateSingle Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		usergeneratesinglewithoutapproval = testContext.getPageObjectManager().getusergeneratesinglewithoutapproval();
	}

	@Given("^Login valid Username and Password$")
	public void Login_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@When("^click the settings type in the admin$")
	public void click_the_settings_type_in_the_admin() throws Throwable {
		usergeneratesinglewithoutapproval.clickthesettingstypeintheadmin();
	}

	@Then("^select the settings option$")
	public void select_the_settings_option() throws Throwable {
		usergeneratesinglewithoutapproval.selectthesettingsoption();
	}

	@Then("^click on the approval checkbox$")
	public void click_on_the_approval_checkbox() throws Throwable {
		usergeneratesinglewithoutapproval.clickontheapprovalcheckbox();
	}

	@Then("^click on the button$")
	public void click_on_the_button() throws Throwable {
		usergeneratesinglewithoutapproval.clickonthebutton();
	}
	@Then("^click on the signout option$")
	public void click_on_the_signout_option() throws Throwable {
		usergeneratesinglewithoutapproval.clickonthesignoutoption();
	}

	@Then("^login with the user details$")
	public void login_with_the_user_details() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click the Certificate Dropdown$")
	public void click_the_Certificate_Dropdown() throws Throwable {
		usergeneratesinglewithoutapproval.clicktheCertificateDropdown();
	}

	@Then("^Select the single generation$")
	public void Select_the_single_generation() throws Throwable {
		usergeneratesinglewithoutapproval.Selectthesinglegeneration();
	}

	@Then("^click on the certificate type$")
	public void click_on_the_certificate_type() throws Throwable {
		usergeneratesinglewithoutapproval.clickonthecertificatetype();
	}

	@Then("^Enter all input fields$")
	public void Enter_all_input_fields() throws Throwable {
		usergeneratesinglewithoutapproval.Enterallinputfields();
	}

	@Then("^click the Generate Certificate button$")
	public void click_the_Generate_Certificate_button() throws Throwable {
		usergeneratesinglewithoutapproval.clicktheGenerateCertificatebutton();
	}

	
}

