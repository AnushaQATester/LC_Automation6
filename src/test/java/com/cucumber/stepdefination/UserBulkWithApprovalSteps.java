package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithApprovalPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBulkWithApprovalSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkWithApprovalPageObjects bulkwithapproval;

	public UserBulkWithApprovalSteps(TestContext context) {
		System.out.println("Started Bulk With Approvals");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkwithapproval = testContext.getPageObjectManager().getbulkwithapproval();
	}


	@Given("^login for Admin by Username and password$")
	public void login_for_Admin_by_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
		Thread.sleep(10000);
	}

	@Then("^select settings$")
	public void select_settings() throws Throwable {
		//bulkwithapproval.selectsettings();
	}

	@Then("^click Approval checkbox$")
	public void click_Approval_checkbox() throws Throwable {
	   // bulkwithapproval.clickApprovalcheckbox();
	}

	@Then("^Scroll down and click submit$")
	public void scroll_down_and_click_submit() throws Throwable {
		//bulkwithapproval.Scrolldownandclicksubmit();
	}

	@Then("^Click the Signout$")
	public void click_the_Signout() throws Throwable {
		//bulkwithapproval.ClicktheSignout();
	}

	@Then("^select bulk generation$")
	public void select_bulk_generation() throws Throwable {
		//bulkwithapproval.selectbulkgeneration();
	}

	@Then("^Upload pdf Files$")
	public void upload_pdf_Files() throws Throwable {
		//bulkwithapproval.UploadpdfFiles();
	}

	@Then("^Upload Data Files$")
	public void upload_Data_Files() throws Throwable {
		//bulkwithapproval.UploadDataFiles();
	}
	
}

