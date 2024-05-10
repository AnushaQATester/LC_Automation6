package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminAddCertificateTypePageObjects;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenSingleWithApprovalPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenSingleWithApprovalSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleWithApprovalPageObjects withapproval;

	public UserGenSingleWithApprovalSteps(TestContext context) {
		System.out.println("Started Generate Single With Approval ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		withapproval = testContext.getPageObjectManager().getwithapproval();
	}
	

	@Given("^login by Admin Username and password by the user$")
	public void login_by_Admin_Username_and_password_by_the_user() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@1");
		Thread.sleep(10000);
	}

	@Then("^click the adminsettings dropdown(\\d+)$")
	public void click_the_adminsettings_dropdown(int arg1) throws Throwable {
		//withapproval.clicktheadminsettingsdropdown1();
	}

	@Then("^select on settings(\\d+)$")
	public void select_on_settings(int arg1) throws Throwable {
		//withapproval.selectonsettings1();
	}

	@Then("^click the Approval checkbox(\\d+)$")
	public void click_the_Approval_checkbox(int arg1) throws Throwable {
		//withapproval.clicktheApprovalcheckbox1();
	}

	@Then("^click the Submit(\\d+)$")
	public void click_the_Submit(int arg1) throws Throwable {
		//withapproval.clicktheSubmit1();
	}

	@Then("^click of signout(\\d+)$")
	public void click_of_signout(int arg1) throws Throwable {
		//withapproval.clickofsignout1();
	}

	@Then("^login the user details(\\d+)$")
	public void login_the_user_details(int arg1) throws Throwable {
		//withapproval.logintheuserdetails1();
	}

	@Then("^click with certificate dropdown(\\d+)$")
	public void click_with_certificate_dropdown(int arg1) throws Throwable {
		//withapproval.clickwithcertificatedropdown1();
	}

	@Then("^select the Single Generation(\\d+)$")
	public void select_the_Single_Generation(int arg1) throws Throwable {
		//withapproval.selecttheSingleGeneration1();
	}

	@Then("^click of Certificate type(\\d+)$")
	public void click_of_Certificate_type(int arg1) throws Throwable {
		//withapproval.clickofCertificatetype1();
	}

	@Then("^Enter the input fields(\\d+)$")
	public void enter_the_input_fields(int arg1) throws Throwable {
		//withapproval.Entertheinputfields1();
	}

	@Then("^click on single approval(\\d+)$")
	public void click_on_single_approval(int arg1) throws Throwable {
		//withapproval.clickonsingleapproval1();
	}
}

