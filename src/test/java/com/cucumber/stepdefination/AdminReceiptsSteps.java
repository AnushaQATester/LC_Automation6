package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminReceiptsPageObjects;
import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;

import com.cucumber.utility.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminReceiptsSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminReceiptsPageObjects receipts;
	

	public AdminReceiptsSteps(TestContext context) {
		System.out.println("Started Receipts Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		receipts = testContext.getPageObjectManager().getreceipts();
	}

	@Given("^Login into InstituteAdmin by using Username and Password$")
	public void Login_() throws Throwable {
		login.Logintoappln("testingtest", "Admin@1");
	}

	@When("^Click on Reports$")
	public void Click_On_reports() throws Throwable {
		//receipts.clickOnReports();
	}

	@Then("^Click on Receipts$")
	public void Click_on_Receipts() throws Throwable {
		//receipts.clickonReceipts();

	}

	@Then("^Click on Next button$")
	public void Click_On_Nextbutton() throws Throwable {
		//receipts.clickonnextbutton();
	}
	
}


	