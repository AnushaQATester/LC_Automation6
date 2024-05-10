package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.UserVerifiedCertificatesPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificatePageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserVerifyCertificatesSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserVerifyCertificatePageObjects verifycertificate;

	public UserVerifyCertificatesSteps(TestContext context) {
		System.out.println("Started UserVerify Certificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		verifycertificate = testContext.getPageObjectManager().getverifycertificate();
	}

	@Given("^login by the user and enter username and password$")
	public void login_by_the_user_and_enter_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(10000);
	}

	@When("^click on the certificates$")
	public void click_on_the_certificates() throws Throwable {
		verifycertificate.clickonthecertificates();
	}

	@Then("^click the Verify Certificates option$")
	public void click_the_Verify_Certificates_option() throws Throwable {
		//verifycertificate.clicktheVerifyCertificatesoption();
	}

	@Then("^Select the certificate type$")
	public void Select_the_certificate_type() throws Throwable {
		//verifycertificate.Selectthecertificatetype();
	}

	@Then("^fill all the input fields and click on Next button$")
	public void fill_all_the_input_fields_and_click_on_Next_button() throws Throwable {
		//verifycertificate.fillalltheinputfieldsandclickonNextbutton();
	}

	@Then("^upload original certificate and QR Code$")
	public void upload_original_certificate_and_QR_Code() throws Throwable {
		//verifycertificate.uploadoriginalcertificateandQRCode();
	}

    @Then("^click on Next button$")
	public void click_on_Next_button() throws Throwable {
		//verifycertificate.clickonNextbutton();
	}

}