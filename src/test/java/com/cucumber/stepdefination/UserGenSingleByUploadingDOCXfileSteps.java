package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPEGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.PageObjects.UserGenSingleByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleEmailWithMultipleSpecialcharectersPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenSingleByUploadingDOCXfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleByUploadingDOCXfilePageObjects gensinglewithdocx;

	public UserGenSingleByUploadingDOCXfileSteps(TestContext context) {
		System.out.println("Started Generate Single By Uploading DOCX file");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		gensinglewithdocx = testContext.getPageObjectManager().getgensinglewithdocx();
	}


	@Given("^login institution user by username and valid password$")
	public void login_institution_user_by_username_and_valid_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(10000);
	}

	@Then("^Click Certificate Click Generate Single$")
	public void click_Certificate_Click_Generate_Single() throws Throwable {
		//gensinglewithdocx.ClickCertificateClickGenerateSingle();
	}

	@Then("^Click Certificate Type Dropdown and Select Certificate Type$")
	public void click_Certificate_Type_Dropdown_and_Select_Certificate_Type() throws Throwable {
	//gensinglewithdocx.ClickCertificateTypeDropdownandSelectCertificateType();
		
	}

	@Then("^Fill by the Required Fields$")
	public void fill_by_the_Required_Fields() throws Throwable {
		//gensinglewithdocx.FillbytheRequiredFields();
	}

	@Then("^Upload DOCX file into Upload the Document field$")
	public void upload_DOCX_file_into_Upload_the_Document_field() throws Throwable {
		//gensinglewithdocx.UploadDOCXfileintoUploadtheDocumentfield();
	}

	@Then("^Click by Next Button$")
	public void click_by_Next_Button() throws Throwable {
		//gensinglewithdocx.ClickbyNextButton();
	}

}

