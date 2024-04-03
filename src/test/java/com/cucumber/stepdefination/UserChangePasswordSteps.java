package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserChangePasswordPageObjects;
import com.cucumber.utility.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserChangePasswordSteps {
	TestContext testContext;
	LoginPageObjects login;
	private UserChangePasswordPageObjects uchangepwd;

	public UserChangePasswordSteps(TestContext context) {
		System.out.println("Started InstituteAdminChangePassword Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		uchangepwd = testContext.getPageObjectManager().getuchangepwd();
	 
	}
	@Given("^Login with valid Username and valid Password$")
	public void login_with_valid_Username_and_valid_Password() throws Throwable {
		login.Logintoappln("SichuUser", "Admin@1");
		Thread.sleep(10000);
	}

	@Then("^Click on Settings tab$")
	public void click_on_Settings_tab() throws Throwable {
		uchangepwd.clickonSettingstab();
	}

	@Then("^Click the Change Password$")
	public void click_the_Change_Password() throws Throwable {
		uchangepwd.clickthechangepassword();
	}

	@Then("^Enter the Current Password$")
	public void enter_the_Current_Password() throws Throwable {
		uchangepwd.enterthecurrentpassword();
	}

	@Then("^Enter the New Password$")
	public void enter_the_New_Password() throws Throwable {
		uchangepwd.enterthenewpassword();
	}

	@Then("^Re Enter the New Password$")
	public void re_Enter_the_New_Password() throws Throwable {
		uchangepwd.Reenterthenewpassword();
	}

	@Then("^Click the Update button then Click the OK button$")
	public void click_the_Update_button_then_Click_the_OK_button() throws Throwable {
		uchangepwd.clicktheupdatebuttonandclicktheokbutton();
	    
	}

}
