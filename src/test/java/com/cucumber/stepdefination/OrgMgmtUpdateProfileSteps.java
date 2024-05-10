package com.cucumber.stepdefination;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.OrgMgmtUpdateProfilePageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgMgmtUpdateProfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	OrgMgmtUpdateProfilePageObjects orgmgmtupdtprf;
	

	public OrgMgmtUpdateProfileSteps(TestContext context) {
		System.out.println("Started Organizationmanagement Updateprofile Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		orgmgmtupdtprf = testContext.getPageObjectManager().getorgmgmtupdtprf();
		
	}
	
	@Given("^Login as Username and Password$")
	public void login_as_Username_and_Password() throws Throwable {
		login.Logintoappln("sankar12", "Global12@");
		Thread.sleep(4000);
	}
	@Then("^Click the Settings option$")
	public void click_the_Settings_option() throws Throwable {
		//orgmgmtupdtprf.clicktheSettingsoption();
	}

	@Then("^Click the update profile$")
	public void click_the_update_profile() throws Throwable {
		//orgmgmtupdtprf.clicktheupdateprofile();
	}
	@Then("^Clear the first name$")
	public void clear_the_first_name_filed() throws Throwable {
		//orgmgmtupdtprf.clearthefirstname();
	}

	@Then("^Enter the first name$")
	public void enter_on_first_name_filed() throws Throwable {
		//orgmgmtupdtprf.enterthefirstname();
	}

	@Then("^Clear the Last Name$")
	public void clear_the_Last_Name() throws Throwable {
		//orgmgmtupdtprf.clearthelastname();
	}

	@Then("^Enter the Last Name$")
	public void enter_the_Last_Name() throws Throwable {
		//orgmgmtupdtprf.enterthelaststname();
	}

	@Then("^Clear the Email Id$")
	public void clear_the_Email_Id() throws Throwable {
		//orgmgmtupdtprf.cleartheemailid();
	}

	@Then("^Enter the Email Id$")
	public void enter_the_Email_Id() throws Throwable {
		//orgmgmtupdtprf.entertheemailid();
	}

	@Then("^Clear the Mobile Number$")
	public void clear_the_Mobile_Number() throws Throwable {
		//orgmgmtupdtprf.clearthemobilenumber();
	}

	@Then("^Enter the Mobile Number$")
	public void enter_the_Mobile_Number() throws Throwable {
		//orgmgmtupdtprf.enterthemobilenumber();
	}
	@Then("^Click Submit button$")
	public void click_Submit_button() throws Throwable {
		//orgmgmtupdtprf.clickthesubmitbutton();
	    
	}
	@And("^Click on the Ok option$")
	public void click_on_the_Ok_option() throws Throwable {
		//orgmgmtupdtprf.clickontheokoption();
	}
	@Then("^Click as Signout$")
	public void click_as_Signout() throws Throwable {
	//orgmgmtupdtprf.clickasSignout();
}
}