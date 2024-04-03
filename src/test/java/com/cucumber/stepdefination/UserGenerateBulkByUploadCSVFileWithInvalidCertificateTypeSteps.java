package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithInvalidCertificateNamePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithInvalidCertificateTypePageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFileWithInvalidCertificateTypeSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkByUploadCSVFileWithInvalidCertificateTypePageObjects invalidcertificatetype;
	
	public UserGenerateBulkByUploadCSVFileWithInvalidCertificateTypeSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidcertificatetype = testContext.getPageObjectManager().getinvalidcertificatetype();

	}

	
    
	@Given("^the Application is Already Running good$")
	public void the_Application_is_Already_Running_good() throws Throwable {
	    
	}

	@When("^the user Logs in using their valid credentials$")
	public void the_user_Logs_in_using_their_valid_credentials() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(3000);
	}

	@Then("^A popup window should Appear clear$")
	public void a_popup_window_should_Appear_clear() throws Throwable {
		// System.out.println("login done");
	}

	@Then("^the User Navigates to the \"([^\"]*)\" section further$")
	public void the_User_Navigates_to_the_section_further(String arg1) throws Throwable {
		invalidcertificatetype.theUserNavigatestotheCertificates1sectionfurther();
	}

	@Then("^Selects \"([^\"]*)\" from the menu options for click$")
	public void selects_from_the_menu_options_for_click(String arg1) throws Throwable {
		invalidcertificatetype.SelectsBulkCertificates1fromthemenuoptionsforclick();
	}

	@Then("^Chooses an option from the dropdown list for select$")
	public void chooses_an_option_from_the_dropdown_list_for_select() throws Throwable {
		invalidcertificatetype.Choosesanoptionfromthedropdownlistforselect();
	}

	@Then("^Uploads both a JPG and a CSV(\\d+) file parallely$")
	public void uploads_both_a_JPG_and_a_CSV_file_parallely(int arg1) throws Throwable {
		invalidcertificatetype.UploadsbothaJPGandaCSV1fileparallely();
	}

	@Then("^Checks the checkbox before Clicking on the save button and clicks$")
	public void checks_the_checkbox_before_Clicking_on_the_save_button_and_clicks() throws Throwable {
		//invalidcertificatetype.ChecksthecheckboxbeforeClickingonthesavebuttonandclicks();
	}

}