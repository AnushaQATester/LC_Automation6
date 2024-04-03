package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPEGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.PageObjects.UserGenSingleByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleEmailWithMultipleSpecialcharectersPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenSingleByUploadingJPGfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleByUploadingJPGfilePageObjects gensinglewithjpg;

	public UserGenSingleByUploadingJPGfileSteps(TestContext context) {
		System.out.println("Started Generate Single By Uploading JPG file");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		gensinglewithjpg = testContext.getPageObjectManager().getgensinglewithjpg();
	}


	@Given("^login institution user by username and password$")
	public void login_institution_user_by_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(10000);
	}

	@Then("^click on certificate click on the generate single$")
	public void click_on_certificate_click_on_the_generate_single () throws Throwable {
		gensinglewithjpg.clickoncertificateclickonthegeneratesingle();
	}

	@Then("^click Certificate Type Dropdown Select Certificate Type$")
	public void click_Certificate_Type_Dropdown_Select_Certificate_Type() throws Throwable {
		gensinglewithjpg.clickCertificateTypeDropdownSelectCertificateType();
	}

	@Then("^fill the required fields$")
	public void fill_the_required_fields() throws Throwable {
		gensinglewithjpg.filltherequiredfields();
	}

	@Then("^Upload JPG file into upload the document field$")
	public void upload_JPG_file_into_upload_the_document_field() throws Throwable {
		gensinglewithjpg.UploadJPGfileintouploadthedocumentfield();
	}

	@Then("^Click next button$")
	public void Click_next_button() throws Throwable {
		gensinglewithjpg.Clicknextbutton();
	}
	
}

