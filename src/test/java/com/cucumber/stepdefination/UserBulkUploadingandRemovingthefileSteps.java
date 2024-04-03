package com.cucumber.stepdefination;
import com.cucumber.PageObjects.UserInternalPrintingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkUploadingandRemovingthefilePageObjects;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.*;

public class UserBulkUploadingandRemovingthefileSteps 

{
	TestContext testContext;
	LoginPageObjects login;
	UserBulkUploadingandRemovingthefilePageObjects emptystuname;
	
	
	  public  UserBulkUploadingandRemovingthefileSteps (TestContext context) {

		System.out.println("Started Generate Bulk by upload and removing the file ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		emptystuname=new UserBulkUploadingandRemovingthefilePageObjects(Constants.driver);
		
	}
	  @Given("^login with valid credentails$")
	  public void login_with_valid_credentails() throws Throwable {
	    login.Logintoappln("SahUser", "User@1");
	  }

	  @Given("^clickon certificates$")
	  public void clickon_certificates() throws Throwable {
		  emptystuname.clickonCertificate();
	     
	  }

	  @When("^select certificateType$")
	  public void select_certificateType() throws Throwable {
		  emptystuname.selectCertficate();
	  }

	  @When("^click on checkbox$")
	  public void click_on_checkbox() throws Throwable {
		  emptystuname.checkCheckBox();
	  }

	  @Then("^Verify the Error msg displayed without uploading csv file$")
	  public void verify_the_Error_msg_displayed_without_uploading_csv_file() throws Throwable {
		  emptystuname.verifytheErrormsg(); 
	  }



}


