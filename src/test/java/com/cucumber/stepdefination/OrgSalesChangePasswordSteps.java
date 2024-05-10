package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.OrgSalesChangePasswordPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgSalesChangePasswordSteps {
	TestContext testContext;
	LoginPageObjects login;
	OrgSalesChangePasswordPageObjects oschangepwd;

	public OrgSalesChangePasswordSteps(TestContext context) {
		System.out.println("Started OrgSalesChangePassword Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		oschangepwd = testContext.getPageObjectManager().getoschangepwd();
	}
	@Given("^Login through Username and Password$")
	public void login_through_Username_and_Password() throws Throwable {
		login.Logintoappln("pavan123", "Global12@");
		Thread.sleep(4000);
	}

	@Then("^Click on Settings option$")
	public void click_on_Settings_option() throws Throwable {
		//oschangepwd.clickOnSettingsoption();
	}

	@Then("^Click on Change Password$")
	public void click_on_Change_Password() throws Throwable {
		//oschangepwd.clickOnchangepassword();
	}

	@Then("^Enter Current Password$")
	public void enter_Current_Password() throws Throwable {
		//oschangepwd.entercurrentpassword();
	}

	@Then("^Enter New Password$")
	public void enter_New_Password() throws Throwable {
		//oschangepwd.enternewpassword();
	}

	@Then("^Re Enter New Password$")
	public void re_Enter_New_Password() throws Throwable {
		//oschangepwd.Reenternewpassword();
	}

	@Then("^Click on Update and Click on OK$")
	public void click_on_Update_and_Click_on_OK() throws Throwable {
		//oschangepwd.clickonupdateandclickonok();
	}

	@Then("^Click Sign Out$")
	public void click_Sign_Out() throws Throwable {
		//oschangepwd.clicksignout();
	}


}