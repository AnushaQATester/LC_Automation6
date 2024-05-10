package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminGeneratedCertificatesSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminGeneratedCertificatesPageObjects admingeneratedcertificates;

	public AdminGeneratedCertificatesSteps(TestContext context) {
		System.out.println("Started InstituteAdminReportsGeneratedCertificates Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		admingeneratedcertificates = testContext.getPageObjectManager().getadmingeneratedcertificates();
	}

	@Given("^Login through valid Username and Password$")
	public void login_through_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^Click the Reports option$")
	public void click_the_Reports_option() throws Throwable {
		//admingeneratedcertificates.clicktheReportsoption();
	}

	@Then("^Click on Generated Certificates$")
	public void click_on_Generated_Certificates() throws Throwable {
		//admingeneratedcertificates.clickOnGeneratedCertificates();
	}

	@Then("^Click on Student Name$")
	public void Click_on_Student_Name() throws Throwable {
		//admingeneratedcertificates.ClickonStudentName();
	}

	@Then("^Click the Send Mail icon and Click Ok$")
	public void click_the_Send_Mail_icon_and_Click_Ok() throws Throwable {
		admingeneratedcertificates.clickthesendmailiconandclickonOk();
	}

	@Then("^Click on Revoke icon and Click on Ok$")
	public void click_on_Revoke_icon_and_Click_on_Ok() throws Throwable {
		//admingeneratedcertificates.clickonRevokeiconandclickonOk();
	}

	@Then("^Click the Download Source File icon and Click on Ok$")
	public void click_the_Download_Source_File_icon_and_Click_on_Ok() throws Throwable {
		//admingeneratedcertificates.clickthedownloadsourcefileiconandclickonOK();
	}

	@Then("^Click the Download Key File icon and Click on Ok$")
	public void click_the_Download_Key_File_icon_and_Click_on_Ok() throws Throwable {
		//admingeneratedcertificates.clickthedownloadkeyfileiconandclickonOk();
	}

	@Then("^Click on Header Checkbox$")
	public void click_on_Header_Checkbox() throws Throwable {
		//admingeneratedcertificates.clickonHeadercheckbox();
	}

	@Then("^Click on Action Dropdown$")
	public void click_on_Action_Dropdown() throws Throwable {
		//admingeneratedcertificates.clickonActiondropdown();
	}

	@Then("^Select send mail and click on GO button$")
	public void select_Download_Source_file_and_click_on_GO_button() throws Throwable {
		//admingeneratedcertificates.selectsendmailandclickonGobutton();
	}
	@Then("^Click on Ok button$")
	public void click_on_Ok_button() throws Throwable {
		//admingeneratedcertificates.clickonOkbutton();
	   	}

	@Then("^Click by Signout page$")
	public void click_by_Signout_page() throws Throwable {
		//admingeneratedcertificates.ClickbySignoutpage();
	}
	   
	}

