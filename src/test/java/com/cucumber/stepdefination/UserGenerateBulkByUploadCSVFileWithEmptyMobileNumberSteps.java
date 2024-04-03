package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithEmptyMobileNumberPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithEmptyStudentNamePageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFileWithEmptyMobileNumberSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkByUploadCSVFileWithEmptyMobileNumberPageObjects emptymobilenum;
	
	public UserGenerateBulkByUploadCSVFileWithEmptyMobileNumberSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		emptymobilenum =testContext.getPageObjectManager().getemptymobilenum();
		
	}

	
	@Given("^The application has been Launched$")
	public void the_application_has_been_Launched() throws Throwable {
	    
	}

	@When("^The user logs in with valid credentials$")
	public void the_user_logs_in_with_valid_credentials() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(3000);
		}

	@Then("^A Popup should appear$")
	public void a_Popup_should_appear() throws Throwable {
		 System.out.println("login done");
	}

	@Then("^The user clicks on the certificates$")
	public void The_user_clicks_on_the_certificates() throws Throwable {
		emptymobilenum.Theuserclicksonthecertificates();
	}

	@Then("^The User Selects bulk certificates from the menu$")
	public void The_User_Selects_bulk_certificates_from_menu() throws Throwable {
		emptymobilenum.TheUserSelectsbulkcertificatesfromthemenu();
	}

	@Then("^The User chooses an option from the dropdown menu$")
	public void the_User_chooses_an_option_from_the_dropdown_menu() throws Throwable {
		emptymobilenum.TheUserchoosesanoptionfromthedropdownmenu();
	}

	@Then("^The User uploads a JPG and a CSV file$")
	public void the_User_uploads_a_JPG_and_a_CSV_file() throws Throwable {
		emptymobilenum.TheUseruploadsaJPGandaCSVfile();
	}

	@Then("^The User checks the checkbox and clicks the save button$")
	public void the_User_checks_the_checkbox_and_clicks_the_save_button() throws Throwable {
		emptymobilenum.TheUserchecksthecheckboxandclicksthesavebutton();
	}

}