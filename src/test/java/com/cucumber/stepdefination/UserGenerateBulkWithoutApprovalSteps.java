package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenerateBulkWithoutApprovalSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkWithoutApprovalPageObjects userbulkwithoutapproval;

	public UserGenerateBulkWithoutApprovalSteps(TestContext context) {
		System.out.println("Started Bulk Without Approvals");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		userbulkwithoutapproval = testContext.getPageObjectManager().getuserbulkwithoutapproval();
	}

	@Given("^login for Admin with Username and password$")
	public void login_for_Admin_with_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^click on adminsettings dropdown$")
	public void click_on_adminsettings_dropdown() throws Throwable {
		userbulkwithoutapproval.clickonadminsettingsdropdown();
	}

	@Then("^select the settings$")
	public void select_the_settings() throws Throwable {
		userbulkwithoutapproval.selectthesettings();
	}

	@Then("^click on Approval checkbox$")
	public void click_on_Approval_checkbox() throws Throwable {
		userbulkwithoutapproval.clickonApprovalcheckbox();
	}

	@Then("^scroll down and click on Submit$")
	public void scroll_down_and_click_on_Submit() throws Throwable {
		userbulkwithoutapproval.scrolldownandclickonSubmit();
	}

	@Then("^click by signout$")
	public void click_by_signout() throws Throwable {
		userbulkwithoutapproval.clickbysignout();
	}

	@Then("^login with user details$")
	public void login_with_user_details() throws Throwable {
		userbulkwithoutapproval.loginwithuserdetails();
	}
	@Then("^click on certificate dropdown$")
	public void click_on_certificate_dropdown() throws Throwable {
		userbulkwithoutapproval.clickoncertificatedropdown();
	}
	@Then("^select the Bulk Generation$")
	public void select_the_Bulk_Generation() throws Throwable {
		userbulkwithoutapproval.selecttheBulkGeneration();

	}

	@Then("^click on Certificate type$")
	public void click_on_Certificate_type() throws Throwable {
		userbulkwithoutapproval.clickonCertificatetype();	
	}

	@Then("^upload the PDF files$")
	public void upload_the_PDF_files() throws Throwable {
		userbulkwithoutapproval.uploadthePDFfiles();
	}
	
	@Then("^upload the data files$")
	public void upload_the_data_files() throws Throwable {
		userbulkwithoutapproval.uploadthedatafiles();
	}
	
}