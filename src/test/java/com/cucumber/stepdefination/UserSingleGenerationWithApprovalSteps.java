package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserSingleGenerationWithApprovalPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserSingleGenerationWithApprovalSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserSingleGenerationWithApprovalPageObjects singlegenerationwithapproval;

	public UserSingleGenerationWithApprovalSteps(TestContext context) {
		System.out.println("Started Institute User_ Generate Single With Approval");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		singlegenerationwithapproval = testContext.getPageObjectManager().getsinglegenerationwithapproal();
	}

	@Given("^login of Admin Username and password$")
	public void login_of_Admin_Username_and_password() throws Throwable {
		login.Logintoappln("TestAdmin", "Admin@1");

	}

	@Then("^click the adminsettings dropdown$")
	public void click_the_adminsettings_dropdown() throws Throwable {
		//singlegenerationwithapproval.clicktheadminsettingsdropdown();
	}

	@Then("^select on settings$")
	public void select_on_settings() throws Throwable {
		//singlegenerationwithapproval.selectonsettings();
	}

	@Then("^click by Approval checkbox$")
	public void click_by_Approval_checkbox() throws Throwable {
		//singlegenerationwithapproval.clickbyApprovalcheckbox();
	}

	@Then("^click the Submit$")
	public void click_the_Submit() throws Throwable {
		//singlegenerationwithapproval.clicktheSubmit();
	}

	@Then("^click of signout$")
	public void click_of_signout() throws Throwable {
		//singlegenerationwithapproval.clickofsignout();
	}

	@Then("^login the user details$")
	public void login_the_user_details() throws Throwable {
		//singlegenerationwithapproval.logintheuserdetails();
	}

	@Then("^click with certificate dropdown$")
	public void click_with_certificate_dropdown() throws Throwable {
		//singlegenerationwithapproval.clickwithcertificatedropdown();
	}

	@Then("^select the Single Generation$")
	public void select_the_Single_Generation() throws Throwable {
		//singlegenerationwithapproval.selecttheSingleGeneration();
	}

	@Then("^click of Certificate type$")
	public void click_of_Certificate_type() throws Throwable {
	//	singlegenerationwithapproval.clickofCertificatetype();
	}

	@Then("^Enter the input fields$")
	public void enter_the_input_fields() throws Throwable {
		//singlegenerationwithapproval.Entertheinputfields();
	}

	@Then("^click on single approval$")
	public void click_on_single_approval() throws Throwable {
		//singlegenerationwithapproval.clickonsingleapproval();
	}

}