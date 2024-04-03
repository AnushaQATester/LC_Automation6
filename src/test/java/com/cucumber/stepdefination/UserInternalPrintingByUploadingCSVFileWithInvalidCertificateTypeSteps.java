package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingByUploadingCSVFileWithInvalidCertificateTypePageObjects;
import com.cucumber.PageObjects.UserInternalPrintingByUploadingCSVFileWithInvalidIssueYearandMonthPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInternalPrintingByUploadingCSVFileWithInvalidCertificateTypeSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingByUploadingCSVFileWithInvalidCertificateTypePageObjects invalidcertificatetype1;
	

	public UserInternalPrintingByUploadingCSVFileWithInvalidCertificateTypeSteps(TestContext context) {
		System.out.println("Started User Internal Printing ByUploading CSV File invalid certificate type steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidcertificatetype1 = testContext.getPageObjectManager().getinvalidcertificatetype1();

	}

	@Given("^I Log in a Valid Username and Password$")
	public void i_Log_in_with_a_Valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(10000);
	}

	@When("^Navigate the certificate option$")
	public void Navigate_to_the_certificates_option() throws Throwable {
		invalidcertificatetype1.Navigatethecertificateoption();
	}

	@When("^Select internal printing type$")
	public void Select_internal_printing_type() throws Throwable {
		invalidcertificatetype1.Selectinternalprintingtype();
	}

	@When("^Choose appropriate certificate type$")
	public void Choose_appropriate_certificate_type() throws Throwable {
		invalidcertificatetype1.Chooseappropriatecertificatetype();
	}

	@When("^Upload the CSV file with invalid certificate type$")
	public void Upload_the_CSV_file_with_invalid_certificate_type() throws Throwable {
		invalidcertificatetype1.UploadtheCSVfilewithinvalidcertificatetype();
	}

	@Then("^An error message should be displayed$")
	public void an_error_message_should_be_displayed() throws Throwable {
		invalidcertificatetype1.Anerrormessageshouldbedisplayed();
	}
}
