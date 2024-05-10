package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenSingleByUploadingJPEGfilePageObjects;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.*;

public class UserGenSingleByUploadingJPEGfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleByUploadingJPEGfilePageObjects gensinwithjpeg;
	
	public UserGenSingleByUploadingJPEGfileSteps(TestContext context)
	{
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		gensinwithjpeg=new UserGenSingleByUploadingJPEGfilePageObjects(Constants.driver);
	}
	
	@Given("^login user to the application$")
	public void login_user_to_the_application() throws Throwable {
	    login.Logintoappln("SahUser", "User@1");
		Thread.sleep(10000);
	}

	@Given("^Click on to the certificates and generatesigle link$")
	public void click_on_to_the_certificates_and_generatesigle_link() throws Throwable {
	    //gensinwithjpeg.clickoncertificateandgenearatesingle();
	}

	@When("^select certificatetype$")
	public void select_certificatetype() throws Throwable {
	  // gensinwithjpeg.selectCertificate();
	}

	@When("^fill the details of student$")
	public void fill_the_details_of_student() throws Throwable {
	  //  gensinwithjpeg.fillStudentDeatils();
	}

	@When("^upload the certificate and submit$")
	public void upload_the_certificate_and_submit() throws Throwable {
	    gensinwithjpeg.uploadCertificate();
	}

}