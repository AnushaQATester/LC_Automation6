package com.cucumber.stepdefination;
import com.cucumber.PageObjects.UserInternalPrintingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGeneratedCertificatesWithoutEnablecheckboxesPageObjects;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.*;

public class UserGeneratedCertificatesWithoutEnablecheckboxesSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingPageObjects ipo;
	UserGeneratedCertificatesWithoutEnablecheckboxesPageObjects generatedcertificates1;


	public UserGeneratedCertificatesWithoutEnablecheckboxesSteps(TestContext context) {

		System.out.println("Started Add Certificate Type ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		generatedcertificates1=new UserGeneratedCertificatesWithoutEnablecheckboxesPageObjects(Constants.driver);

	}

	@Given("^log to application$")
	public void log_to_application() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(3000);
	}

	@Given("^click on reports and generatedcertificates$")
	public void click_on_reports_and_generatedcertificates() throws Throwable {
		generatedcertificates1.clcikonreportsandgenearatedcertiifcates();
	}

	@Given("^select the value certificatetype$")
	public void select_the_value_certificatetype() throws Throwable {
		generatedcertificates1.selectValueCertificate();
	}

	@When("^perform click operation the DropDown values$")
	public void perform_click_operation_the_DropDown_values() throws Throwable {
		generatedcertificates1.performclickoperation();
	}

}
