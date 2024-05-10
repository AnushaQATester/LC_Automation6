package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithEmptyCertificateNamePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithInvalidCertificateNamePageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFileWithEmptyCertificateNameSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkByUploadCSVFileWithEmptyCertificateNamePageObjects emptycertificatename1;

	public UserGenerateBulkByUploadCSVFileWithEmptyCertificateNameSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		emptycertificatename1 = testContext.getPageObjectManager().getemptycertificatename1();

	}



	@Given("^the Application already running good$")
	public void the_Application_already_running_good() throws Throwable {

	}

	@When("^the User logs in using their Valid Credentials(\\d+)$")
	public void the_User_logs_in_using_their_Valid_Credentials(int arg1) throws Throwable {
		login.Logintoappln("SahUser", "User@1"); 
		Thread.sleep(4000);
	}

	@Then("^The popup window should appear clear$")
	public void the_popup_window_should_appear_clear() throws Throwable {
		//System.out.println("login done");
	}

	@Then("^the user navigates to Certificates section$")
	public void the_user_navigates_to_Certificates_section() throws Throwable {
		//emptycertificatename1.theusernavigatestoertificatessection();
	}

	@Then("^Selects Bulk Certificates from the menu$")
	public void selects_Bulk_Certificates_from_the_menu() throws Throwable {
		//emptycertificatename1.SelectsBulkCertificatesfromthemenu();
	}

	@Then("^Chooses an option from the Dropdown list for select$")
	public void chooses_an_option_from_the_Dropdown_list_for_select() throws Throwable {
		//emptycertificatename1.ChoosesanoptionfromtheDropdownlistforselect();
	}

	@Then("^Uploads both a JPG and a CSV file Parallely$")
	public void uploads_both_a_JPG_and_a_CSV_file_Parallely() throws Throwable {
		//emptycertificatename1.UploadsbothaJPGandaCSVfileParallely();
	}

	@Then("^Checks the checkbox Before clicking on the save button and clicks$")
	public void checks_the_checkbox_Before_clicking_on_the_save_button_and_clicks() throws Throwable {
		//emptycertificatename1.ChecksthecheckboxBeforeclickingonthesavebuttonandclicks();
	}

}