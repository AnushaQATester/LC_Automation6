package com.cucumber.stepdefination;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.OrgMgmtChangePasswordPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgMgmtChangePasswordSteps {
	TestContext testContext;
	LoginPageObjects login;
	OrgMgmtChangePasswordPageObjects orgmgmtchangepassword;

	public OrgMgmtChangePasswordSteps(TestContext context) {
		System.out.println("Started OrganizationManagementChangePassword Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		orgmgmtchangepassword = testContext.getPageObjectManager().getorgmgmtchangepassword();
	 
	}
	@Given("^Login into Username and Password$")
	public void login_into_Username_and_Password() throws Throwable {
		login.Logintoappln("sankar12", "Global12@");
		Thread.sleep(4000);	
		
	}

	@Then("^Click on the settings tab$")
	public void click_on_the_settings_tab() throws Throwable {
		//orgmgmtchangepassword.clickonthesettingstab();
	}

	@Then("^Click change password$")
	public void click_change_password() throws Throwable {
		//orgmgmtchangepassword.clickchangepassword();
	}

	@Then("^enter current password$")
	public void enter_current_password() throws Throwable {
		//orgmgmtchangepassword.entercurrentpassword();
	}

	@Then("^enter new password$")
	public void enter_new_password() throws Throwable {
		//orgmgmtchangepassword.enternewpassword();
	}

	@Then("^re enter new password$")
	public void re_enter_new_password() throws Throwable {
		//orgmgmtchangepassword.reenternewpassword();
	}

	@Then("^Click by Update and Click OK$")
	public void click_by_Update_and_Click_OK() throws Throwable {
		//orgmgmtchangepassword.clickbyupdateandclickok();
	    
	}

}