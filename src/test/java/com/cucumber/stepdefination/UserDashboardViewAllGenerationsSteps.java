package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardViewAllGenerationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserDashboardViewAllGenerationsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserDashboardViewAllGenerationsPageObjects viewallgenerations;

	public UserDashboardViewAllGenerationsSteps(TestContext context) {
		System.out.println("Started Dashboard View All Generations ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		viewallgenerations = testContext.getPageObjectManager().getviewallgenerations();
	}
	@Given("^login by the user valid Username and Password$")
	public void login_by_the_user_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(10000);
	}

	@Then("^Scroll down the vertical bar$")
	public void Scroll_down_the_vertical_bar() throws Throwable {
		viewallgenerations.Scrolldowntheverticalbar();
	}

	@Then("^click on the Certificate type dropdown and select the type$")
	public void click_on_the_Certificate_type_dropdown_and_select_the_type() throws Throwable {
		viewallgenerations.clickontheCertificatetypedropdownandselectthetype();
	}

	@Then("^click on the View All Generations button$")
	public void click_on_the_View_All_Generations_button() throws Throwable {
		viewallgenerations.clickontheViewAllGenerationsbutton();
	}


	
}