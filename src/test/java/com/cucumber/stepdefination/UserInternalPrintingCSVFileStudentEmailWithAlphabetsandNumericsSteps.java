package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserWelcomeTextPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects invalidemailid;

	public UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsSteps(TestContext context) {
		System.out.println("Started User Internal printing with invalid data ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidemailid = testContext.getPageObjectManager().getinvalidemailid();
	}
	

	@Given("^login by the valid username and password$")
	public void login_by_the_valid_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click Internal Printing option$")
	public void click_Internal_Printing_option() throws Throwable {
		invalidemailid.ClickInternalPrintingoption();
	}

	@Then("^Click certificate type dropdown$")
	public void click_certificate_type_dropdown() throws Throwable {
		invalidemailid.Clickcertificatetypedropdown();
	}

	@Then("^Click as upload invalid CSV file$")
	public void click_as_upload_invalid_CSV_file() throws Throwable {
		invalidemailid.ClickasuploadinvalidCSVfile();
	}

}
	
	
	
	
