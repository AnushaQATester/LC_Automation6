package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsRecallPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsQRCodePageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsSendMailPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRecentCertificateGenerationsRecallSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserRecentCertificateGenerationsRecallPageObjects recall;

	public UserRecentCertificateGenerationsRecallSteps(TestContext context) {
		System.out.println("Started User Recent Certificate Generations Recall ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		recall = testContext.getPageObjectManager().getrecall();
	}
	

	@Given("^login at through Username and password$")
	public void login_at_through__Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^scroll the vertical bar$")
	public void scroll_the_vertical_bar() throws Throwable {
		//recall.scrolltheverticalbar();
	}

	@Then("^click Recall icon in Recent Certificate Generations$")
	public void click_Recall_icon_in_Recent_Certificate_Generations() throws Throwable {
		//recall.clickRecalliconinRecentCertificateGenerations();
	}
	
	}