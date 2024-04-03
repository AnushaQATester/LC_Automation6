package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingByUploadInvalidCSVFIlePageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInternalPrintingByUploadInvalidCSVFileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingByUploadInvalidCSVFIlePageObjects invalidcsv;
	

	public UserInternalPrintingByUploadInvalidCSVFileSteps(TestContext context) {
		System.out.println("Started UserVerifiedCertificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidcsv = testContext.getPageObjectManager().getinvalidcsv();

	}

	@Given("^log in with a valid Username and Password$")
	public void log_in_with_a_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^I navigate to  Certificates type tab$")
	public void i_navigate_to_Certificates_type_tab() throws Throwable {
		invalidcsv.i_navigate_to_Certificates_type_tab();
	}

	@When("^select the internal printing$")
	public void select_the_internal_printing() throws Throwable {
		invalidcsv.select_the_internal_printing();
	}

	@When("^choose the appropriate Certificate$")
	public void choose_the_appropriate_Certificate() throws Throwable {
		invalidcsv.choose_the_appropriate_Certificate();
	}

	@When("^attempt to upload a CSV file containing invalid email addresses, student names, and mobile numbers$")
	public void attempt_to_upload_a_CSV_file_containing_invalid_email_addresses_student_names_and_mobile_numbers() throws Throwable {
		invalidcsv.attempt_to_upload_a_CSV_file_containing_invalid_email_addresses_student_names_and_mobile_numbers();
	}

	@Then("^an error message indicating the issues should be displayed$")
	public void an_error_message_indicating_the_issues_should_be_displayed() throws Throwable {
		invalidcsv.an_error_message_indicating_the_issues_should_be_displayed();
	}
}