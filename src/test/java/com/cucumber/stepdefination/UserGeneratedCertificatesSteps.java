package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGeneratedCertificatesPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGeneratedCertificatesSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGeneratedCertificatesPageObjects usergeneratedcertificates;

	public UserGeneratedCertificatesSteps(TestContext context) {
		System.out.println("Started UserGeneratedCertificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		usergeneratedcertificates = testContext.getPageObjectManager().getusergeneratedcertificates();
	}
	
    @Given("^login with the valid Username and password$")
	public void login_with_the_valid_Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click on reports type$")
	public void click_on_reports_type() throws Throwable {
		usergeneratedcertificates.clickonreportstype();
	}

	@Then("^Click the generated certificates$")
	public void click_the_generated_certificates() throws Throwable {
		usergeneratedcertificates.Clickthegeneratedcertificates();
	}

	@Then("^Click the academic reference number$")
	public void click_the_academic_reference_number() throws Throwable {
		usergeneratedcertificates.Clicktheacademicreferencenumber();
	}

	@Then("^Click on sendmail icon then click Ok button$")
	public void click_on_sendmail_icon_then_click_Ok_button() throws Throwable {
		usergeneratedcertificates.ClickonsendmailiconthenclickOkbutton();
	}

	@Then("^Click the revoke icon then click the Ok$")
	public void click_the_revoke_icon_then_click_the_Ok() throws Throwable {
		usergeneratedcertificates.ClicktherevokeiconthenclicktheOk();
	}

	@Then("^Click on download original certificate icon then click the Ok$")
	public void click_on_download_original_certificate_icon_then_click_the_Ok() throws Throwable {
		usergeneratedcertificates.ClickondownloadoriginalcertificateiconthenclicktheOk();
	}

	@Then("^Click on Download QR Code icon then click the Ok$")
	public void click_on_Download_QR_Code_icon_then_click_the_Ok() throws Throwable {
		usergeneratedcertificates.ClickonDownloadQRCodeiconthenclicktheOk();
	}

	@Then("^Click the header checkbox$")
	public void click_the_header_checkbox() throws Throwable {
		usergeneratedcertificates.Clicktheheadercheckbox();
	}

	@Then("^Click the action dropdown$")
	public void click_the_action_dropdown() throws Throwable {
	usergeneratedcertificates.Clicktheactiondropdown();
	}

	@Then("^select the SendMail then click the GO$")
	public void select_the_SendMail_then_click_the_GO() throws Throwable {
		usergeneratedcertificates.selecttheSendMailthenclicktheGO();
	}

	@Then("^click the Ok$")
	public void click_the_Ok() throws Throwable {
		usergeneratedcertificates.clicktheOk();
	}
	
}

