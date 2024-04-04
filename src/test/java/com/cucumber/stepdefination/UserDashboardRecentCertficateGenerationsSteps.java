package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserDashboardViewAllGenerationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserDashboardRecentCertficateGenerationsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserDashboardRecentCertificateGenerationsPageObjects dbrecentcertificategenerations;

	public UserDashboardRecentCertficateGenerationsSteps(TestContext context) {
		System.out.println("Started Dashboard Recent Certificate Generations ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		dbrecentcertificategenerations = testContext.getPageObjectManager().getdbrecentcertificategeneration();
	}
	@Given("^login the user valid Username and Password$")
	public void login_the_user_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(10000);
	}

	@Then("^scroll by vertical$")
	public void scroll_by_vertical() throws Throwable {
		dbrecentcertificategenerations.scrollbyvertical();
	}

	@Then("^click on the cerificate type dropdown and select the type$")
	public void click_on_the_cerificate_type_dropdown_and_select_the_type() throws Throwable {
		dbrecentcertificategenerations.clickonthecerificatetypedropdownandselectthetype();
	}

	@Then("^click on the student name$")
	public void click_on_the_student_name() throws Throwable {
		dbrecentcertificategenerations.clickonthestudentname();
	}

	@Then("^click and scroll the page$")
	public void click_and_scroll_the_page() throws Throwable {
		//dbrecentcertificategenerations.clickandscrollthepage();
	}
	
	@Then("^click on the print button$")
	public void click_on_the_print_button() throws Throwable {
		//dbrecentcertificategenerations.clickontheprintbutton();
	}

	
}