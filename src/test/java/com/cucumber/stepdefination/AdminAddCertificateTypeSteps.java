package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminAddCertificateTypePageObjects;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminAddCertificateTypeSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminAddCertificateTypePageObjects addcertificatetype;

	public AdminAddCertificateTypeSteps(TestContext context) {
		System.out.println("Started Add Certificate Type ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		addcertificatetype = testContext.getPageObjectManager().getaddcertificatetype();
	}
	@Given("^login admin username and password$")
	public void login_admin_username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^click on the Certificates$")
	public void click_on_the_Certificates() throws Throwable {
		addcertificatetype.clickontheCertificates();
	}


	@Then("^click on the Add Certificate Type$")
	public void click_on_the_Add_Certificate_Type () throws Throwable {
		addcertificatetype.clickontheAddCertificateType();
	}

	@Then("^enter the certificate type into field$")
	public void enter_the_certificate_type_into_field() throws Throwable {
		addcertificatetype.enterthecertificatetypeintofield();
	}
	
	@Then("^click on the Type dropdown and select the option$")
	public void click_on_the_Type_dropdown_and_select_the_option() throws Throwable {
		addcertificatetype.clickontheTypedropdownandselecttheoption();
	}
	
	@Then("^click on Go button$")
	public void click_on_Go_button() throws Throwable {
		addcertificatetype.clickonGobutton();
	}

	}