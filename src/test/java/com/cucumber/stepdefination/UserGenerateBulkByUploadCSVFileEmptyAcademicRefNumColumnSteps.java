package com.cucumber.stepdefination;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkUploadCSVFileWithEmptyAcademicRefNumColumn;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFileEmptyAcademicRefNumColumnSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkUploadCSVFileWithEmptyAcademicRefNumColumn bulkinvalidcsv1;

	public UserGenerateBulkByUploadCSVFileEmptyAcademicRefNumColumnSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkinvalidcsv1 = testContext.getPageObjectManager().getbulkinvalidcsv1();
	}



	@Given("^the application has been launched$")
	public void the_application_has_been_launched() throws Throwable {

	}

	@When("^the User logs in with valid credentials$")
	public void the_User_logs_in_with_valid_credentials() throws Throwable {
		login.Logintoappln("SahUser", "User@1"); 
		Thread.sleep(4000);

	}

	@Then("^a popup should appear$")
	public void a_popup_should_appear() throws Throwable {
		//System.out.println("login done");
	}

	@Then("^the User clicks on the \"([^\"]*)\" option$")
	public void the_User_clicks_on_the_option(String arg1) throws Throwable {
		//bulkinvalidcsv1.ClickOnCertificates();
	}

	@Then("^the User selects \"([^\"]*)\" from the menu$")
	public void the_User_selects_from_the_menu(String arg1) throws Throwable {
		//bulkinvalidcsv1.clickOnGenerateBulk();

	}

	@Then("^the User chooses an option from the dropdown menu$")
	public void the_User_chooses_an_option_from_the_dropdown_menu() throws Throwable {
		//bulkinvalidcsv1.clickOndropDown();

	}

	@Then("^the User uploads a JPG and a CSV file$")
	public void the_User_uploads_a_JPG_and_a_CSV_file() throws Throwable {
		//bulkinvalidcsv1.files_upload();
	}

	@Then("^the User checks the checkbox and clicks the save button$")
	public void the_User_checks_the_checkbox_and_clicks_the_save_button() throws Throwable {
		//bulkinvalidcsv1.next_button();
	}
}
