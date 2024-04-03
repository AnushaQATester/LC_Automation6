package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPEGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.PageObjects.UserGenSingleByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleEmailWithMultipleSpecialcharectersPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenSingleByUploadingDOCfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleByUploadingDOCfilePageObjects gensinglewithdoc;

	public UserGenSingleByUploadingDOCfileSteps(TestContext context) {
		System.out.println("Started Generate Single By Uploading DOC file");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		gensinglewithdoc = testContext.getPageObjectManager().getgensinglewithdoc();
	}


	@Given("^login institution user by valid username and password$")
	public void login_institution_user_by_valid_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(5000);
	}

	@Then("^click on certificate click Generate single$")
	public void click_on_certificate_click_Generate_single() throws Throwable {
		gensinglewithdoc.clickoncertificateclickGeneratesingle();
	}

	@Then("^click on Certificate type dropdown and select certificate type$")
	public void click_on_Certificate_type_dropdown_and_select_certificate_type() throws Throwable {
		gensinglewithdoc.clickonCertificatetypedropdownandselectcertificatetype();
	}

	@Then("^Fill by the required fields$")
	public void fill_by_the_required_fields() throws Throwable {
		gensinglewithdoc.Fillbytherequiredfields();
	}

	@Then("^Upload DOC file into Upload the document field$")
	public void upload_DOC_file_into_Upload_the_document_field() throws Throwable {
		gensinglewithdoc.UploadDOCfileintoUploadthedocumentfield();
	}

	@Then("^click by next button$")
	public void click_by_next_button() throws Throwable {
		gensinglewithdoc.clickbynextbutton();
	}
}

